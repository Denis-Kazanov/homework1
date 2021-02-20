package lesson11;

public class Main {
    public static void main(String[] args) {
        Animal animalMonkey = new Animal(10, "Обезьяна");
        System.out.println(animalMonkey);
        Animal animalElephant = new Animal(10, "Обезьяна");
        boolean eqalsAnimal = animalMonkey.equals(animalElephant);
        System.out.println(eqalsAnimal);
        animalElephant.getClass();
        Elephant elephant = new Elephant();
        elephant.voice();
    }
}
