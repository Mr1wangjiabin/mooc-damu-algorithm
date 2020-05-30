package mooc.damumoye;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>();//数组实现
        LinkedList<String> linkedList = new LinkedList<String>();//链表实现

        //链表与数组的性能比较：添加、小数据 1000

        long start1 = System.nanoTime();//获取当前时间
        for (int i = 0; i < 1000; i++) {
            arrayList.add("" + i);
        }
        long end1 = System.nanoTime();
        System.out.println("添加1000条数据数组所消耗的时间：" + (end1 - start1));

        long start2 = System.nanoTime();//获取当前时间
        for (int i = 0; i < 1000; i++) {
            linkedList.add("" + i);
        }
        long end2= System.nanoTime();
        System.out.println("添加1000条数据链表所消耗的时间：" + (end2 - start2));

        //链表与数组的性能比较：添加、大数据 1000 00

        long start3 = System.nanoTime();//获取当前时间
        for (int i = 0; i < 100000; i++) {
            arrayList.add("" + i);
        }
        long end3 = System.nanoTime();
        System.out.println("添加100000条数据数组所消耗的时间：" + (end3 - start3));

        long start4 = System.nanoTime();//获取当前时间
        for (int i = 0; i < 1000; i++) {
            linkedList.add("" + i);
        }
        long end4= System.nanoTime();
        System.out.println("添加100000条数据链表所消耗的时间：" + (end4 - start4));


    }

}
