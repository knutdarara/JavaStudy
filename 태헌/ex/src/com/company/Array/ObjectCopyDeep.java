package com.company.Array;

public class ObjectCopyDeep {
    public static void main(String[]args){
        //객체 배열 복사 : 깊은 복사

        Book[] bookArray1 =new Book[3];
        Book[] bookArray2 =new Book[3];

        bookArray1[0]= new Book("태백산맥1","조정래");
        bookArray1[1]= new Book("태백산맥2","조정래");
        bookArray1[2]= new Book("태백산맥3","조정래");

        bookArray2[0]=new Book();
        bookArray2[1]=new Book();
        bookArray2[2]=new Book();

        for(int i=0;i< bookArray1.length;i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }


        bookArray1[0].setBookName("태헌산맥");
        bookArray1[0].setAuthor("태헌");

        for(int i=0;i<bookArray1.length;i++){
            bookArray1[i].showBookInfo();
        }
        System.out.println("-------------------------");
        for(int i=0;i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }



    }

}
