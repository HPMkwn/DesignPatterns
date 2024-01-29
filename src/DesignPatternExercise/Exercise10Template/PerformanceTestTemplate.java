package DesignPatternExercise.Exercise10Template;

import java.util.ArrayList;
import java.util.List;

public abstract class PerformanceTestTemplate {

    public abstract void testIteration();

    public abstract int getWarmupIterationsNum();

    public abstract int getIterationsNum();

    public void run(){

        for(int i=0;i<getWarmupIterationsNum();i++){
            testIteration();
        }

        final List<Long> iterationsExecutionsTimes = new ArrayList<>();

        for(int i=0;i<getIterationsNum();i++){
            long start = System.currentTimeMillis();
            testIteration();
            long end = System.currentTimeMillis();
            iterationsExecutionsTimes.add(end-start);
        }

        final double avg = iterationsExecutionsTimes.stream().mapToDouble(x->x).average().getAsDouble();

        System.out.println("Avverage time per iteration " + avg);
    }
}
