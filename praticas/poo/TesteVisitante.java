package praticas.poo;

public class TesteVisitante {

    public static void main(String[] args) {
//        Visitante visitante = new Visitante();
//        visitante.nome = "Mirella";
//        visitante.idade = 20;
//
//        if (visitante.possuiAcessoRestritoPorIdade()) {
//            System.out.println("Acesso não permitido para menosres de 18 anos.");
//        } else {
//            System.out.println("Acesso liberado");
//        }

        var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
//        var codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);

    }
}
