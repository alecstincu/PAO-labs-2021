package ro.unibuc.pao.practice;

public class CalculatorImpl implements Calculator {
    @Override
    public Double add(Double nr1, Double nr2) throws BadInputException {
        if (nr1 > nr2) {
            throw new BadInputException("Primul numar este mai mare ca cel de-al doilea");
        }

        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) throws BadInputException, InvalidParameterException {
        if (nr2 == 0) {
            throw new InvalidParameterException();
        }

        if (nr1 > nr2) {
            throw new BadInputException("Primul numar este mai mare ca cel de-al doilea");
        }

        return nr1 / nr2;
    }
}
