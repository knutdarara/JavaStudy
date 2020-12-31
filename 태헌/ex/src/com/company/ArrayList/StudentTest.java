package com.company.ArrayList;

public class StudentTest {
    public static void main(String[]args){
        Student studentKim = new Student(141049,"KIM");
        studentKim.addSubject("국어",85);
        studentKim.addSubject("수학",95);

        studentKim.showStudentInfo();
        System.out.println("========================");
        Student studentS = new Student(141050,"S");
        studentS.addSubject("국어",85);
        studentS.addSubject("수학",95);

        studentS.showStudentInfo();
    }
}
