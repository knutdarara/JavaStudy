package ArrayList;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }
    // 과목리스트에 추가할수 있어야하기때문에 과목추가를 함수로 만듬
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }
    // 학생의 수강과목을 보여주는 함수
    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjectList){
            total += subject.getScorePoint();

            System.out.println("학생" + studentName + "님의" + subject.getName() + " 과목의 성적은 " + subject.getScorePoint()
                    + "점 입니다.");
        }
        System.out.println("학생" + studentName + "님의 총점은 " + total + "점 입니다");
    }

}
