package com.company.Array;

public class TwoDimensionArray {
    public static void main(String[]args){

        int[][] arr =new int[2][3];
        System.out.println(arr.length);
        // 2차원 배열의 길이 2행 기준이라 2

        // 1행의 길이
        System.out.println(arr[0].length);
        
        // 2행의 길이
        System.out.println(arr[1].length);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@");

        int[][] arr2 ={{1,2,3},{4,5,6}};
        for(int i=0;i< arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);
            }
            System.out.println(); // 출력이 끝난뒤 한줄 띄움
        }

    
        // 알파벳 넣기
        char[][] alphabets =new char[13][2];
//        char ch  = 'A'; // 65
//        for( int i = 0; i<alphabets.length;i++,ch++){
//            alphabets[i]=ch;
//        }
//        for(int i = 0; i <alphabets.length;i++,ch++){
//            System.out.println(alphabets[i]);
//        }

    }
}
