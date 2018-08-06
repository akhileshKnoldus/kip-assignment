package com.knoldus.assigment1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {

    public static boolean isPrime(int digit) {
        return IntStream.rangeClosed(2, digit / 2).noneMatch(i -> digit % i == 0);
    }

    public static void main(String[] args) {

        int[] array = new Random().ints(100, 1, 100).toArray();


        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());

        List<Integer> result = numbers.stream().filter(Prime::isPrime)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(result);

    }

}