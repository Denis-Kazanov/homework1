package homework11;

public class Calculate implements FractionNumber {
    private int divided;
    private int divisor;

    public Calculate(){

    }
    public Calculate(int divided, int divisor){
        this.divided = divided;
        this.divisor = divisor;
    }
    @Override
    public void setDividend(int dividend) {
        this.divided = dividend;
    }

    @Override
    public int getDividend() {
        return divided;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return (double) divided/divisor;
    }

    @Override
    public String toString() {
        return divided + "/" + divisor;
    }
}
