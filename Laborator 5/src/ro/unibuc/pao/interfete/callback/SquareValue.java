package ro.unibuc.pao.interfete.callback;

public class SquareValue implements ICalculator {

    @Override
    public int transform(int x) {
        return x * x;
    }
}
