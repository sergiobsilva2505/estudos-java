package praticas.procedural;

public class CurtoCircuitoOperadoresLogicos {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = y++ == 20  &&  x == 15;

        System.out.printf("Resultado: %b%n", resultado);
        System.out.print(y);
    }
}
