package com.thegyrfalcon.gryffindor.functional.streams;

import java.util.stream.IntStream;

public class StreamDemo {

    public static void main(String[] args) {
        //01.Int Stream -> Print Range of values.
        IntStream.range(1,10).forEach(System.out::println);

        //02.Int Stream -> Print Range by Skip by 5 values.
        IntStream.range(1,10).skip(5).forEach(System.out::println);

        //03. Sum of range of values.
        int sum = IntStream.range(50,55).sum();
        System.out.println("[StreamDemo] Sum => "+ sum);

        int[] numbers = { 5, 2, 3, 34, 23, 12, 1, 0, 0, 2 };

        //04. Find min value from a given list.
        int minValue = IntStream.of(numbers).min().getAsInt();
        System.out.println("[StreamDemo] Minvalue => "+ minValue);

        //05. Sum of first 3 distinct values.
        int sumOfDistinctValues = IntStream.of(numbers)
                                           .distinct()
                                           .sorted()
                                           .limit(3)
                                           .sum();
        System.out.println("[StreamDemo]  Sum of first 3 distinct values => "+ sumOfDistinctValues);

    }

}
