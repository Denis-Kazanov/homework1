package lesson18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//            ArrayList<Integer> test = new ArrayList<>();
//            test.add(10);
//            test.add(12);
//            test.add(13);
//            for (Iterator<Integer> iter = test.iterator();iter.hasNext();){
//                    System.out.println(iter.next());
//
//            }



            MultiMapImpl<String, String> telephonBook = new MultiMapImpl<>();
            telephonBook.put("Денис", "+79067146161");
            telephonBook.put("Денис", "+74957100909");
            telephonBook.put("Егор", "+7907945131");
            telephonBook.put("Егор", "+79079451321");
            telephonBook.put("Артур","+7945151454");
            telephonBook.put("Витёк","+7951514544");
          //  System.out.println(telephonBook.get("Денис"));
          //  System.out.println(telephonBook.containsValue("+79067146161"));
          //  System.out.println(telephonBook.containsKey("Денис"));
          //  telephonBook.remove("Денис");
           // System.out.println(telephonBook.get("Денис"));
         //   System.out.println(telephonBook.valuesIterator("Денис"));
            MultiMapImpl<String, String> telephonBook2 = new MultiMapImpl<>();
            telephonBook2.put("Денис", "+79067146161");
            telephonBook2.put("Денис", "+79067146162");
            telephonBook2.put("Tujh", "+79067146162");
            telephonBook.putAll(telephonBook2);
            System.out.println(telephonBook.get("Денис"));

    }
}
