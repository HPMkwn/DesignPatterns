package DesignPatternExercise.Exercise10Template;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PerformanceTestConcreteClass extends PerformanceTestTemplate{


    @Override
    public void testIteration() {

        final List<Long> longList = Stream.generate(()-> new Random().nextLong()).limit(10000).collect(Collectors.toList());

        final List<Long> sortedList = longList.stream().sorted().toList();
    }

    @Override
    public int getWarmupIterationsNum() {
        return 2;
    }

    @Override
    public int getIterationsNum() {
        return 10;
    }
}
