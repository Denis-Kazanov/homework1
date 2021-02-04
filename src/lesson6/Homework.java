package lesson6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        System.out.println(countGlass("Какой то текс"));
        System.out.println(countSoglasnie("Какой то текст"));
        biggestNum(20,201,3);
        countWord("Какой то больше чем обычно");
    }

    public static int countGlass(String text) {
        char[] arr_ru = {'а', 'е', 'ё', 'и',
                'о', 'у', 'э', 'ю', 'я', 'ы', 'Ы', 'А', 'Е', 'Ё', 'И',
                'О', 'У', 'Э', 'Ю', 'Я'};
        char[] abc = text.toCharArray();
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < abc.length; i++) {
            for (int x = 0; x < arr_ru.length; x++) {
                if (abc[i] == arr_ru[x]) {
                    word.append(abc[i]);
                    break;
                }
            }
        }
        return word.length();


    }

    public static int countSoglasnie(String text) {
        char[] arr_ru = {'б', 'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т',
                'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с',
                'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        char[] abc = text.toCharArray();
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < abc.length; i++) {
            for (int x = 0; x < arr_ru.length; x++) {
                if (abc[i] == arr_ru[x]) {
                    word.append(abc[i]);
                    break;
                }
            }
        }
        return word.length();


    }
    public static void biggestNum(int a, int b, int c){
        List<Integer> nums = new ArrayList<>();
        nums.add(a);
        nums.add(b);
        nums.add(c);
        Collections.sort(nums);
        System.out.println(nums.get(nums.size()-1));

    }
    public static void countWord(String text){
        String[] words=text.split(" ");
        System.out.println(words.length);
    }

}
