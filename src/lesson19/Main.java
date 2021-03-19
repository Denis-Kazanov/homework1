package lesson19;


import  org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER =  Logger.getLogger(Main.class); // ПЕРВЫЙ ПАРАМЕТР ЭТО НАЗВАНИЕ КЛАССА В КОТОРОМ ЛОГЕР

    public static void main(String[] args) {
        LOGGER.fatal("Hello");


    }
}
