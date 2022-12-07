package praticas.poo;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        double valorRevendaCarro = calcularValorRevenda();
        int tempoDeUsoDoCarro = calcularTempoDeUsoemAnos();

        System.out.printf("Tempo de uso (anos): %d%n",tempoDeUsoDoCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaCarro);
    }

    int calcularTempoDeUsoemAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularIPVA() {
        int tempoDeUsoemAnos = calcularTempoDeUsoemAnos();

        if (tempoDeUsoemAnos > 0) {
            return 0;
        }
        return calcularValorRevenda() * 0.04;
    }


    double calcularValorRevenda() {

        calcularTempoDeUsoemAnos();

        int vidaUtilEmAnos = 20;

        double valorRevenda  = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - calcularTempoDeUsoemAnos());

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

}
