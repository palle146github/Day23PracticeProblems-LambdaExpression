package com.bridgelabz.lambdaexpression.usecase1and2;
@FunctionalInterface
public interface IMathFunction {
    int calculate( int x, int y);

    static void calculateAndPrint(int x, int y, String function, IMathFunction ref){
        System.out.println(function + " of " + x +  ", " + y + " is " + ref.calculate(x,y));
    }
}
