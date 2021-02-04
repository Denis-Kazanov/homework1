package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InitSuper {
    public static char[][] createField(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество строк в игре");
        int rows = scanner.nextInt();
        System.out.println("ведите количество колонок в игре ");
        int cols = scanner.nextInt();
        char [][] field = new char[rows][cols];
        return field;
    }
    public static String getNameLevel(){
        System.out.println("Введите уровень сложности \n Введите: слабый, средний или сильный");
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
      }
      public static void printGameField(char[][] filed){
        for (int i = 0; i < filed.length; i++){
            for (int j =0; j < filed[i].length; j++){
                System.out.print(filed[i][j]+ "  ");
            }
         System.out.println();
        }


      }
      public static char[][] filedBombs(char [][] filed,String level){
        int mines = 0;
        if(level.equalsIgnoreCase("слабый")){
            mines = filed.length * filed[0].length/10;
        }else if (level.equalsIgnoreCase("средний")){
            mines = filed.length * filed[0].length/5;
        }else mines=filed.length * filed[0].length /100*30;
        for (int i =0; i < mines; i++){
            int randoWRow = ThreadLocalRandom.current().nextInt(0, filed.length);
            int randomCol = ThreadLocalRandom.current().nextInt(0, filed[0].length);
            if(filed[randoWRow][randomCol]!= '*'){
                filed[randoWRow][randomCol] = '*';

            }else {

            }
            filed[randoWRow][randomCol] = '*';
        }
        return filed;

      }


}
