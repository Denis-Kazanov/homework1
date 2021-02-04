package lesson8;

public class GameSuper {
    public static void main(String[] args) {
        char[][] field = InitSuper.createField();
        String getLevel = InitSuper.getNameLevel();
        InitSuper.filedBombs(field, getLevel);
        InitSuper.printGameField(field);
    }
}
