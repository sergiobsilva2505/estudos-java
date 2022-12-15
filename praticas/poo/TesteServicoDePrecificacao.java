package praticas.poo;

public class TesteServicoDePrecificacao {

    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

//        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);
//
//        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);

//        Produto novoProduto = new Produto();
//        novoProduto.precoCusto = 100;
//
//        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);
//
//        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);

        Produto novoProduto1 = new Produto();
        Produto novoProduto2 = new Produto();

        Produto.custoEmbalagem = 10;
        Produto.custoEmbalagem = 15;

        novoProduto1.imprimirCustoEmbalagem();
        novoProduto2.imprimirCustoEmbalagem();
    }
}
