package DesignPatternExercise.Exercise6Adapter;

public enum PegiAgeRating {
    P3(3), P7(7), P12(12), P16(16), P18(18);
    int age;

    PegiAgeRating(int age){
        this.age = age;
    }
}
