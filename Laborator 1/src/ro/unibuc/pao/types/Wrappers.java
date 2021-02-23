package ro.unibuc.pao.types;

/**
 * Clasele Wrapper sunt folosite pentru a folosi primitivele pe post de obiecte, atunci cand este necesar.
 *
 * Primitive Data Type  |  Wrapper Class
 * - byte                   Byte
 * - short                  Short
 * - int                    Integer
 * - long                   Long
 * - float                  Float
 * - double                 Double
 * - boolean                Boolean
 * - char                   Character
 */
public class Wrappers {

    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer i1 = Integer.valueOf(2);
        double i1DoubleValue = i1.doubleValue();
        int i1IntValue = i1.intValue();
        String intAsString = i1.toString();
    }
}
