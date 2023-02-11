package com.bridgelabz.lambdaexpression.usecase1and2;

public class LambdaMain {

    public static void main(String[] args) {
        IMathFunction obj = new Impl();
        IMathFunction sum1 = Integer::sum;
        IMathFunction sum2 = (a , b ) -> a + b;
        IMathFunction mul = (a , b ) -> a * b;
        IMathFunction div = (a , b ) -> a / b;
        IMathFunction max = Integer::max;;
        System.out.println(sum1.calculate(4,5));
        System.out.println(sum2.calculate(4,5));
        System.out.println(mul.calculate(4,5));
        System.out.println(div.calculate(4,5));
        System.out.println(max.calculate(4,5));

        IMathFunction.calculateAndPrint(4,5,"Addition --> ",sum1);
        IMathFunction.calculateAndPrint(4,5,"Addition --> ",sum2);
        IMathFunction.calculateAndPrint(4,5,"Multiplication --> ",mul);
        IMathFunction.calculateAndPrint(4,5,"Division --> ",div);
        IMathFunction.calculateAndPrint(4,5,"MaxiMum --> ",max);


    }
}
