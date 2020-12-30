package com.company.ex_static;

public class StudentTest1 {
    public static void main(String[] args){
        Student studentJ = new Student();
        System.out.println(studentJ.studentID);


        Student studentT = new Student();
        System.out.println(studentT.studentID);


//        System.out.println(studentJ.serialNum);
//        System.out.println(studentT.serialNum);
//    //스태틱변수를 참조할떄 클래스명을 참조하지않고 인스턴스 변수의 명으로 참조하면  경고문구가 나옴.
//        System.out.println(Student.serialNum);

        //외부에서 참조해서 가져올때
        System.out.println(Student.getSerialNum());
    }
}
