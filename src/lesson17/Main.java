package lesson17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DecendingSort sort = new DecendingSort();
        TreeSet<Integer> nums = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        nums.add(12);
        nums.add(13);
        nums.add(1);
        nums.add(122);
        nums.add(1432);
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(4);
        test.add(10);
        test.add(-1);
        test.add(-100);
        Collections.sort(test);
        System.out.println(test);
        test.sort(sort);
        System.out.println(test);


        for(int n: nums){
            System.out.println(n);

        }



    }


}
