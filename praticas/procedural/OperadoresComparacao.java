package praticas.procedural;

public class OperadoresComparacao {
    public static void main(String[] args) {
        int pesoProdutos = 1000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida  = pesoProdutos > limitePesoCaminhao;

        System.out.printf("Carga excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos < limitePesoCaminhao; // pode ser usado tbm '>= ou <='

        System.out.printf("Carga liberada: %b%n", cargaLiberada);
    }
}
