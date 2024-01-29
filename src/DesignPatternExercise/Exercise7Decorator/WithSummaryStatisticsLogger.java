package DesignPatternExercise.Exercise7Decorator;

import java.util.List;

public class WithSummaryStatisticsLogger implements StatisticsLogger{

    private StatisticsLogger executionTimesBaseStatistics;
    public WithSummaryStatisticsLogger(StatisticsLogger executionTimesBaseStatistics) {
        this.executionTimesBaseStatistics = executionTimesBaseStatistics;
    }

    @Override
    public void displayStatistics() {

        System.out.println(getExecutionTimes().stream().mapToDouble(x->x).summaryStatistics());

        this.executionTimesBaseStatistics.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return this.executionTimesBaseStatistics.getExecutionTimes();
    }
}
