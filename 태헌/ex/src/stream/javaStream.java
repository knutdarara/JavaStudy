package stream;

import java.util.ArrayList;
import java.util.List;

public class javaStream {
    public static void main(String[]args){
        javaStudy Kim = new javaStudy("김태헌","남자",26);
        javaStudy Kim2 =new javaStudy("김용래","남자",26);
        javaStudy Seo =new javaStudy("서환건","남자",28);
        javaStudy Sim =new javaStudy("심민우","남자",30);
        javaStudy Ki =new javaStudy("기연지","여자",24);

        List<javaStudy> studyList = new ArrayList<javaStudy>();
        studyList.add(Kim);
        studyList.add(Kim2);
        studyList.add(Seo);
        studyList.add(Sim);
        studyList.add(Ki);
        System.out.println(studyList);

        // 성별 출력
        studyList.stream().map(c->c.getSex()).forEach(s->System.out.println(s));
        System.out.println();

        // 나이가 26살 이하인사람출력
        studyList.stream().filter(a->a.getAge()<=26).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
        System.out.println();

        studyList.stream().filter(b->b.getSex()=="여자").map(c->c.getName()).sorted().forEach(s->System.out.println(s));




    }

}
