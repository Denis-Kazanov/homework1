package lesson11;

import java.util.Objects;

public class Animal {
    private int age;
    private String nickname;

    public Animal(int age) {
        this.age = age;
    }

    public Animal(){

    }

    public Animal(int age, String nickname){
        this.age = age;
        this.nickname = nickname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickname);
    }
    public void voice(){
        System.out.println("Мяу");
    }
}
