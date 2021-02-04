package lesson6;

public class FigureUtils {
    public final int CONST = 10;
    public static double area(double side_a, double side_b, double side_c) { //Метод вычисляет площадь
        double half_meter = (side_a + side_b + side_c) * .5;
        double s = half_meter*(half_meter-side_a)*(half_meter-side_b)*(half_meter-side_c); //Вычисление площади без корня
        double result = Math.sqrt(s); //Вычисление корня
        System.out.println("Площадь треугольника равна " + result);
        return result;
}}
