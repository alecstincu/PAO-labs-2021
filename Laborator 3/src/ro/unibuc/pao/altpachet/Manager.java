package ro.unibuc.pao.altpachet;

import ro.unibuc.pao.polimorfism.Employee;

public class Manager extends Employee {

    public static int base = 20000;

    // suprascrierea nu se realizeaza deoarece modificatorul de acces din clasa Employee ne limiteaza la clasele din acelasi pachet
    // iar Manager e in alt pachet decat acesta
    int salary() {
        return base + 20000;
    }
}

