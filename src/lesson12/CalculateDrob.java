package lesson12;

public class CalculateDrob implements FractionNumberOperation {


    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivisor = a.getDivisor() * b.getDivisor();
        int resultDevisot = a.getDividend() * b.getDivisor() +a.getDivisor() * b.getDividend();

        FractionNumberIml res = new FractionNumberIml();
        res.setDivisor(resultDivisor);
        res.setDividend(resultDevisot);
        return res;


    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivisor = a.getDivisor() * b.getDivisor();
        int resultDevisot = a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend();

        FractionNumberIml res = new FractionNumberIml();
        res.setDivisor(resultDivisor);
        res.setDividend(resultDevisot);
        return res;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivides = a.getDividend() * b.getDividend();
        int resultDevior = a.getDivisor() * b.getDivisor();
        FractionNumberIml res = new FractionNumberIml();
        res.setDivisor(resultDevior);
        res.setDividend(resultDivides);
        return res;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int resultDivides = a.getDividend() * b.getDivisor();
        int resultDevior = a.getDivisor() * b.getDividend();
        FractionNumberIml res = new FractionNumberIml();
        res.setDivisor(resultDevior);
        res.setDividend(resultDivides);
        return res;
    }
}
