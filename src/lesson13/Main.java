package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qwerty");
        texts.add(0, "hello");
        texts.set(1, "world");
        System.out.println(texts);
        System.out.println(texts.contains("world"));
        System.out.println(texts.get(0));
        String test = texts.remove(1); // Возвращает и удаляет;
        System.out.println(texts + " " + test);
        texts.remove("hello"); // Удаляет по значению и ничего не возвращает
        System.out.println(texts);





    }
}
