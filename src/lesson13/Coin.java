package lesson13;

public class Coin {
    private int year;
    private int diametr;
    private int nominal;
    private String metall;

    public Coin() {

    }

    public Coin(int year, int diametr, int nominal, String metall) {
        this.year = year;
        this.diametr = diametr;
        this.nominal = nominal;
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", diametr=" + diametr +
                ", nominal=" + nominal +
                ", metall='" + metall + '\'' +
                '}';
    }
}
