package praticas.poo;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean abaixoDoPesoIdeal() {
        return resultado < 18.5;
    }

}
