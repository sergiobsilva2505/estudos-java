package praticas.desafio535;

public class TesteCalculadoraArea {

    public static void main(String[] args) {

        double areaDoQuadrado = CalculadoraArea.calcularAreaQuadrado(10);
        System.out.printf("Area quadrado = %.2f%n", areaDoQuadrado);

        double areaDoCirculo = CalculadoraArea.calcularAreaCirculo(10);
        System.out.printf("Area circulo = %.2f%n", areaDoCirculo);

    }
}
