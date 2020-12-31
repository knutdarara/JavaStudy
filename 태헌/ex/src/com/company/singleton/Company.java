package com.company.singleton;

public class Company {

    // 인스턴스가 1개만 있고 내부에서만 쓸거임.
    private static Company instance = new Company();
    // private 생성자  : 외부에서 --를 생성할수 없음
    private Company(){}

    // 가져다 쓰게 하기 위해서 메서드를 만듬
    public static Company getInstance(){
        if(instance == null)
            instance = new Company();
        return instance;
    }
}
