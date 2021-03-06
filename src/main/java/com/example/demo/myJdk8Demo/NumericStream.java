package com.example.demo.myJdk8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class NumericStream {

    public static void main(String[] args) {
//        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
//
//        Integer result = stream.filter(i -> i > 3).reduce(0, Integer::sum);
//
//        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
//        int sum = stream.mapToInt(i -> i.intValue()).filter(i -> i > 3).sum();
//        System.out.println(sum);
//
//        System.out.println(result);
//        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        int a = 9;
//        IntStream intStream = IntStream.rangeClosed(1, 100);
//        List<Integer> collect = intStream.boxed().map(x -> x + 1).collect(toList());
//        List<Integer> collect = intStream.boxed().collect(toList());
//        collect.forEach(System.out::println);
        IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .boxed()
                .map(x -> new int[]{a, x, (int) Math.sqrt(a * a + x * x)})
                .forEach(r->System.out.println("a="+r[0]+",b="+r[1]+",c="+r[2]));

        IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .mapToObj(x -> new int[]{a, x, (int) Math.sqrt(a * a + x * x)})
                .forEach(r->System.out.println("a="+r[0]+",b="+r[1]+",c="+r[2]));




    }
}
