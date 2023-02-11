package com.bridgelabz.lambdaexpression.usecase3;

public class PlayListPrint implements java.util.function.Consumer<Integer> , NumberPrinter{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
