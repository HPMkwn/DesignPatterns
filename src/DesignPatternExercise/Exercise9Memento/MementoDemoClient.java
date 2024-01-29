package DesignPatternExercise.Exercise9Memento;

public class MementoDemoClient {
    public static void main(String[] args) {
        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addValue("This is first time");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addValue("\nThis is second time");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addValue("\nThis is third line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addValue(" This is second part of 3rd line");
        mementoManager.save(new EditorTextMemento(editorText));

        System.out.println(editorText.getValue());
        System.out.println();

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());
        System.out.println(editorText.getValue());

    }
}
