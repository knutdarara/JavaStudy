package com.company.Array;

public class ArrayTest {
    public static void main(String[] args){
        // int [] numbers = new int[3];
        // 3개짜리 배열 생성
        // numbers[0]=1;
        // numbers[1]=2;
        // numbers[2]=3;


        // 3개의 배열이 생성, 초기화
        // 자바에서 많이 사용하는 방법
        int [] numbers = new int[] {1,2,3};
        System.out.println(numbers.length);

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        //
        int [] numbers2 = {0,1,2};
        System.out.println(numbers2.length);


    }
}
