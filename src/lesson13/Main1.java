package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0 ; i<100000; i++){
            arrayList.add("Число " + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
        long startTime2 = System.currentTimeMillis();
        for (int i =0; i < 100000; i++){
            linkedList.add("Число " + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime1);

    }
}
