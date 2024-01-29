package DesignPatternExercise.Exercise7Decorator;

import java.util.List;

public interface StatisticsLogger {
    void displayStatistics();
    List<Double> getExecutionTimes();
}
