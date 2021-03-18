package lessonLast;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("Тест", 100);
        System.out.println(test);
        test.put("Тест" , 1001);
        System.out.println(test);
        test.put("Тест", 6+test.get("Тест"));
        test.put("123", 200);
        System.out.println(test);
        Set<Map.Entry<String, Integer>> entirs = test.entrySet();
        System.out.println(entirs);

    }
}
