package com.company.ex_class;

public class Student_test {
    public static void main(String[] args){
        Student studentKIM = new Student();
//        studentKIM 참조변수
        studentKIM.studentName="김태헌";
        studentKIM.studentID=141049;
        studentKIM.address="인천광역시 미추홀구";

        Student studentLEE = new Student();
        studentLEE.studentName="이준";
        studentLEE.studentID=144424;
        studentLEE.address="광주광역시 북구";

        studentKIM.showStudentInformation();
        studentLEE.showStudentInformation();

        System.out.println(studentKIM);
        System.out.println(studentLEE);
    }

}
