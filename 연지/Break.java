package com.package_test;

public class Break {

    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (true) {
            sum += num;
            if(sum > 100)
                break;
            num++;
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
