package lesson11;

public class ExcellentStudent extends Student {
    @Override
    public int perimeterTriangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB < sideC) {
            System.out.println("Бред");
            return -1;
        }
        return sideA + sideB + sideC;
    }
}
