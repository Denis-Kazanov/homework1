package lesson11;

public class Dog implements ZooAnimal{

    @Override
    public void voice() {
        System.out.println("Gaw");
    }

    @Override
    public void jump() {
        System.out.println("I jump");
    }

    @Override
    public void run() {
        System.out.println("Ruuuuuuuuuuuuuuuuuuuuuuuuuuuuuun");
    }
}
