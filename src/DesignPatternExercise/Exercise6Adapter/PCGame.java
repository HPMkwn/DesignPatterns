package DesignPatternExercise.Exercise6Adapter;

public interface PCGame {
    String getTitle();
    Integer getPegiAllowedAge();
    boolean isTripleAGame();
    Requirements getRequirements();
}