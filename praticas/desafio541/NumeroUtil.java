package praticas.desafio541;

import static java.lang.Math.*;

public class NumeroUtil {

    static int maiorNumero(int i, int j) {
        return i > j ? i : j;
    }

    static int maiorNumero(int i, int j, int k) {
        return maiorNumero(maiorNumero(i, j), k);
    }

    static double maiorNumero(double i, double j) {
        return i > j ? i : j;
    }

    static double maiorNumero(double i, double j, double k) {
        return maiorNumero(maiorNumero(i, j), k);
    }
}
