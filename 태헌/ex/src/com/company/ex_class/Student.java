package com.company.ex_class;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInformation(){
        System.out.println(studentName+","+studentID+"번"+", 거주지: "+address);
    }
    public String getStudentName(){
        return studentName;
    }
    public  void setStudentName(String name){
        studentName =name;
    }
    public static void main(String[] args){
        Student studentKIM = new Student();
//        studentKIM 참조변수
        studentKIM.studentName="김태헌";
        studentKIM.studentID=141049;
        studentKIM.address="인천광역시 미추홀구";

        Student studentLEE = new Student();
        studentLEE.studentName="이준";
        studentLEE.studentID=144444;
        studentLEE.address="광주광역시 북구";

        studentKIM.showStudentInformation();
        studentLEE.showStudentInformation();
    }

}
