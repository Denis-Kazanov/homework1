package lesson14;

import java.nio.file.FileAlreadyExistsException;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UnCurrentAgeExeption, NumberFormatException, NullPointerException {
        if (age < 0 || age >150){
            throw new UnCurrentAgeExeption("Не корректный возраст");
        }
        this.age = age;
    }
}
