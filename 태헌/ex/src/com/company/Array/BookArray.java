package com.company.Array;

public class BookArray {
    public static void main(String[] args){
        Book[] library = new Book[5];
        //5개짜리 배열 생성 >> 책의 주소에 해당하는 공간을 생성

        // Book 인스턴스 멤버를 생성해서 주소에 할당
        library[0] =new Book("태백산맥","조정래");
        library[1] =new Book("신","베르나르베르베르");
        library[2] =new Book("도전","김병만");
        library[3] =new Book("메이플랭커찍기","김태헌");
        library[4] =new Book("취업시켜줘","김태헌");

        // Book의 인스턴스 멤버 출력
        for(int i=0;i<library.length;i++){
            library[i].showBookInfo();
        }
        // Book의 인스턴스를 저장한 메모리 공간 주소 출력
        for(int i=0;i<library.length;i++){
            System.out.println(library[i]);
        }

    }
}
