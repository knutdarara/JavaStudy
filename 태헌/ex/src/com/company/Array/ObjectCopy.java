package com.company.Array;

public class ObjectCopy {
    public static void main(String[]args){

        //객체 배열 복사 : 얕은 복사

        Book[] bookArray1 =new Book[3];
        Book[] bookArray2 =new Book[3];

        bookArray1[0]= new Book("태백산맥1","조정래");
        bookArray1[1]= new Book("태백산맥2","조정래");
        bookArray1[2]= new Book("태백산맥3","조정래");

        //bookArray1을 복사하여 bookArray2에 넣음
        System.arraycopy(bookArray1,0,bookArray2,0,3);

        for(int i=0;i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }
        bookArray1[0].setBookName("태헌산맥");
        bookArray1[0].setAuthor("태헌");

        for(int i=0;i<bookArray1.length;i++){
            bookArray1[i].showBookInfo();
        }

        /// 얕은 복사 : 배열 요소의 주소만 복사되므로, 배열 요소가 변경되면 복사된 배열의 값도 변경됨.
        for(int i=0;i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }


    }
}
