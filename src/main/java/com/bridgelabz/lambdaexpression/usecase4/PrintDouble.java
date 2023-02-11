package com.bridgelabz.lambdaexpression.usecase4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PrintDouble{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(63);
        list.add(65);
        list.add(94);
        list.add(84);
        list.add(39);
        list.add(84);
        list.add(39);
        list.add(78);
        System.out.println("Actual numbers in the list\n");
        list.forEach( n -> System.out.print(n + " "));
        System.out.println("\n");
        System.out.println("Double Numbers are\n");

        Function<Integer, Double> doubleFunction = Integer::doubleValue;
        list.forEach( n -> System.out.print(doubleFunction.apply(n) + " "));


    }
}
