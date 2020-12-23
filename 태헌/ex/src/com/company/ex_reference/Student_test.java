package com.company.ex_reference;

public class Student_test {
    public static void main(String[] args){
        Student studentKIM =new Student(99,"Taehun");
        studentKIM.setKorea(95);
        studentKIM.setMath(100);

        Student studentJ =new Student(100,"Suna");
        studentJ.setMath(90);
        studentJ.setKorea(100);

        studentKIM.showStudentInformation();
        studentJ.showStudentInformation();
    }
}
