package lesson7;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        int couont = 0;
        for (int day = 0; day < 366; day++){
            for (int hours =0; hours < 24; hours++){
                for (int minitues = 0; minitues <60; minitues++){
                    for(int sec =0; sec < 60; sec++){
                      Thread.sleep(1);
                        System.out.printf("Day %d Min %d Hourse %d sec %d \n", day,hours,minitues,sec);

                    }
                }
            }


        }

    }

}
