package lesson14;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UnCurrentAgeExeption {
        if (age < 0 || age >150){
            throw new UnCurrentAgeExeption("Не корректный возраст");
        }
        this.age = age;
    }
}
