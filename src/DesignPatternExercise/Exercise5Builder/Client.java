package DesignPatternExercise.Exercise5Builder;

public class Client {
    public static void main(String[] args) {
        Dog dog = Dog.getBuilder().build();
    }
}
