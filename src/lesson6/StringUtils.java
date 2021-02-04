package lesson6;

public class StringUtils {
    private String name;
    public  static void printtextByWorld(String text){
         String[] massive = text.split(" ");
         for (String s: massive){
             System.out.println(s);
         }



    }
    public String getName() {

        return name;

    }

    public void setName(String name1) {
        name = name1;


    }

    public static void revarse(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));


        }
        System.out.println();
    }

    public void iSayHello() {
        if (name != null) {
            System.out.println("My name is " + name + " and i say Hello world!!!");
        } else System.out.println("I don't have a name");

    }

    public static void sayHello() {
        System.out.println("Hello world");


    }

}

