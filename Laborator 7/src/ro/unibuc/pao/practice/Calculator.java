package ro.unibuc.pao.practice;

public interface Calculator {
    /**
     * Aruncata daca primul nr e mai mare ca al doilea.
     */
    class BadInputException extends Exception {
        BadInputException(String message) {
            super(message);
        }
    }

    /**
     * Aruncata daca parametrul la care se face impartirea e 0.
     */
    class InvalidParameterException extends Exception {
    }

    /**
     * Primeste 2 numere si intoarce suma lor, ca double.
     *
     * @param nr1, primul nr
     * @param nr2, al doilea nr
     * @return suma
     */
    Double add(Double nr1, Double nr2) throws BadInputException;

    /**
     * Primeste 2 numere si intoarce rezultatul impartirii lor, ca double.
     *
     * @param nr1, primul nr
     * @param nr2, al doilea nr
     * @return rezultatul impartirii
     */
    Double divide(Double nr1, Double nr2) throws BadInputException, InvalidParameterException;
}