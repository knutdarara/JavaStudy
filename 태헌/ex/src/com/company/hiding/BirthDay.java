package com.company.hiding;

class Birth {
    private int day;
    private int month;
    private int year;
// 멤버 변수를 프라이빗으로 생성 후 
//    게터세터를 통해 변수의 값을 지정
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month==2){
            if(day<1||day>28){
                System.out.println("날짜 오류입니다.");
            }
        }
        else{
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
public class BirthDay{
    public static void main(String[] args){
        BirthDay day= new BirthDay();

//        day.setMonth(1);
//        day.setDay(30);
//        day.setYear(1996);
    }
}
