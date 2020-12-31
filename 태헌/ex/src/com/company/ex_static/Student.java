package com.company.ex_static;

public class Student {
    private static int serialNum = 10000;

    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {

        int i = 100; // 지역변수
        i++;
        System.out.println(i);

//        studentName="홍길동";       인스턴스,멤버 변수는 스태틱 변수 안에 생성 불가

        return serialNum; // static 변수, 클래스 변수
        //스태틱 메서드 안에서는 멤버변수, 인스턴스 변수 사용불가.
    }
}