package lesson12;

public class Main {
    public static void main(String[] args) {
        FractionNumberIml test = new FractionNumberIml(1, 5);
        FractionNumberIml test2 = new FractionNumberIml(2, 3);
        CalculateDrob cal = new CalculateDrob();
        FractionNumber resultAdd = cal.add(test, test2);
        System.out.println(resultAdd);
        FractionNumber resultSub = cal.sub(test, test2);
        System.out.println(resultSub);
        FractionNumber resultMul = cal.mul(test, test2);
        System.out.println(resultMul);
        FractionNumber resultDiv = cal.div(test, test2);
        System.out.println(resultDiv);


        Matrix matrix = new Matrix(3, 2);
        System.out.println(matrix.getRows() + " " + matrix.getColumns());


    }
}
