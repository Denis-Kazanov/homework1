package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String someStrin = "test +79067146185 4846517 ";
        String pattern = ("\\d+");//Данный патерн означает что ищем только цифры от 0-9
        Pattern prtn = Pattern.compile(pattern);
        Matcher matcher = prtn.matcher(someStrin);
        System.out.println(pattern);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("NotFound");

//        String regularExpression = "\\bjava\\b";
//        String inputString = "java java java2ee java";
//        Pattern pattern = Pattern.compile(regularExpression);
//        Matcher match = pattern.matcher(inputString);
//        int matchCounter = 0;
//
//        System.out.println("Now we will use method find()...");
//        while (match.find()){
//            matchCounter++;
//            System.out.println("start(): "  + match.start());
//            System.out.println("end(): " + match.end());
//            System.out.println("Number of match: " + matchCounter);
//        }

    }


}
