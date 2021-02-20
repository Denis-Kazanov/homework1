package lesson11;

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        ZooAnimal [] test = {dog,dog1,dog2,monkey,monkey2,monkey1};
        for (ZooAnimal animal :test){
            animal.voice();
        }
    }
}
