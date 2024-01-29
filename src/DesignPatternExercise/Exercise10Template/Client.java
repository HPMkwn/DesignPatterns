package DesignPatternExercise.Exercise10Template;

public class Client {
    public static void main(String[] args) {
        final PerformanceTestTemplate performanceTest = new PerformanceTestConcreteClass();

        performanceTest.run();
    }
}
