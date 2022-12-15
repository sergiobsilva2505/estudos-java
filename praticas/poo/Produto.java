package praticas.poo;

public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }
    void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }
    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.println("Custo embalagem = " + custoEmbalagem);
    }
}
