package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int evenSum = 0;
        while (number < 100) {
            number++;
            // System.out.println(number);
            if (number % 2 == 0) {
                //打印偶数
               System.out.println(number);
                //求和;用一个变量接收结果
                evenSum += number;
                System.out.println(evenSum);


            }

        }
    }
}
