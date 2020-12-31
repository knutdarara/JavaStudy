package com.company.Array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for( int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }

        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산맥1","조정래"));
        library.add(new Book("태백산맥2","조정래"));
        library.add(new Book("태백산맥3","조정래"));
        library.add(new Book("태백산맥4","조정래"));
        library.add(new Book("태헌산맥","김태헌"));

        for(int i=0;i<library.size();i++){
            Book book =library.get(i);
            book.showBookInfo();
        }
        System.out.println( );

    }
}
