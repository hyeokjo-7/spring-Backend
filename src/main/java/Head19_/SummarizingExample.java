package Head19_;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {
    public static void main(String[] args) {
        List<Integer> intscores = Arrays.asList(80, 95, 70, 100, 85);

        IntSummaryStatistics intSummaryStatistics = intscores.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(" Int summary Count = " + intSummaryStatistics.getCount());
        System.out.println("Int summary sum = " + intSummaryStatistics.getSum());
        System.out.println("Int summary min = " + intSummaryStatistics.getMin());
        System.out.println("Int summary max = " + intSummaryStatistics.getMax());
        System.out.println("Int sumary Average = " + intSummaryStatistics.getAverage());
    }
}
