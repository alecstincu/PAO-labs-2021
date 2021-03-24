package ro.unibuc.pao.interfete.callback;

public class SameValue implements ICalculator {

    @Override
    public int transform(int x) {
        return x;
    }
}
