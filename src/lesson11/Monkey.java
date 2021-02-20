package lesson11;

public class Monkey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("I am human not monkey");
    }

    @Override
    public void jump() {
        System.out.println("I am jump");
    }

    @Override
    public void run()  {
        System.out.println("Лень бежать если честно");

    }
}
