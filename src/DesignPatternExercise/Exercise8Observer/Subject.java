package DesignPatternExercise.Exercise8Observer;

import java.util.List;

public class Subject {

    private List<Observer> observers;

    private int state;

    public void subscribeyourself(Observer observer){
        if(!observers.contains(observer))
            this.observers.add(observer);
    }

    public void changeStateBy(final int changeValue){
        state += changeValue;
        observers.forEach(Observer::update);
    }

    public int getState() {
        return state;
    }
}
