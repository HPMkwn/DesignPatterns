package DesignPatternExercise.Exercise7Decorator;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger {

    private StatisticsLogger executionTimesBaseStatistics;

    public WithMeanStatisticsLogger(StatisticsLogger executionTimeBaseStatistics) {
        this.executionTimesBaseStatistics = executionTimeBaseStatistics;
    }

    @Override
    public void displayStatistics() {

        System.out.println("Mean of Executions : " + getExecutionTimes().stream().mapToDouble(x->x).average().getAsDouble());

        this.executionTimesBaseStatistics.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.executionTimesBaseStatistics.getExecutionTimes();
    }
}
