package DesignPatternExercise.Exercise9Memento;

public class EditorText {

    private String value;

    public void addValue(final String textToAdd){
        value += textToAdd;
    }

    public String getValue(){
        return value;
    }

    public void restoreFromMemento(final EditorTextMemento editorTextMemento){
        value = editorTextMemento.getValue();
    }

}
