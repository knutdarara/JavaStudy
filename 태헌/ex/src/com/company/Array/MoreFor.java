package com.company.Array;

public class MoreFor {
    public static void main(String[]args){
        String[] strArr={"Java","Android","C"};
        for(int i=0;i< strArr.length;i++){
            System.out.println(strArr[i]);
        }

        for(String s:strArr){
            System.out.println(s);
        }

        int[] arr ={1,2,3,4,5};
        for(int num:arr){
            System.out.println(num);
        }
    }
}

