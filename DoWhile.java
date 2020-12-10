package com.package_test;

public class DoWhile {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        }while(num < 20);

        System.out.println("1부터 20까지 합은 "+ sum + " 입니다.");
    }
}
