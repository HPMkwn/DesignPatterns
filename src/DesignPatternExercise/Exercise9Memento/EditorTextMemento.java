package DesignPatternExercise.Exercise9Memento;

public class EditorTextMemento {

    private final String value;

    public EditorTextMemento(final EditorText editorText) {
        this.value = editorText.getValue();
    }

    public String getValue(){
        return value;
    }

}
