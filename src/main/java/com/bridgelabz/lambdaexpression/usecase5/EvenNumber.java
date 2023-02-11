package com.bridgelabz.lambdaexpression.usecase5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenNumber {
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
        list.forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Even numbers are");
        list.forEach( numbers -> {
            if( isEven.test(numbers)){
                System.out.print(numbers + " ");
            }
        });
    }
}
