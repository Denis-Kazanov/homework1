package lesson14;

public class Main {
    public static void main(String[] args) {
      Person person = new Person();
        try {
            person.setAge(340);
        } catch (UnCurrentAgeExeption unCurrentAgeExeption) {
            unCurrentAgeExeption.printStackTrace();

        }
        System.out.println("Ok");
    }
}
