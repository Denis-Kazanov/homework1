package lesson12;

import java.util.Objects;

public class FractionNumberIml implements FractionNumber{
    private int divided;
    private int divisor;

    public FractionNumberIml(){

    }
    public FractionNumberIml(int divided, int divisor){
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumberIml that = (FractionNumberIml) o;
        return divided == that.divided && divisor == that.divisor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(divided, divisor);
    }

    @Override
    public String toString() {
        return divided + "/" + divisor;
    }
}


