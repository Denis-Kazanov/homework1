package lesson18;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
            MultiMapImpl<String, String> telephonBook = new MultiMapImpl<>();
            telephonBook.put("Денис", "+79067146161");
            telephonBook.put("Денис", "+74957100909");
            telephonBook.put("Егор", "+7907945131");
            telephonBook.put("Егор", "+79079451321");
            telephonBook.put("Артур","+7945151454");
            telephonBook.put("Витёк","+7951514544");
            System.out.println(telephonBook.get("Денис"));
            System.out.println(telephonBook.containsValue("+79067146161"));
            System.out.println(telephonBook.containsKey("Денис"));

    }
}
