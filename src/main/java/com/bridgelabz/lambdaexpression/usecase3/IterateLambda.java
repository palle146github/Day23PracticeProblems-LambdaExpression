package com.bridgelabz.lambdaexpression.usecase3;
import java.util.*;

public class IterateLambda {
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
        System.out.println("Print list element using proper class");
        list.forEach(new PlayListPrint());
        System.out.println("");
        System.out.println("Print list element using anonymous class");
        list.forEach(new PlayListPrint() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        });
        System.out.println("");
        System.out.println("Using Lambda Expression");
        list.forEach(numbers -> System.out.println(numbers));

   }
}
