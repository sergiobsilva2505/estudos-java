package praticas.desafio525;

public class TesteFolhaDePagamento {

    public static void main(String[] args) {

        int horasNormaisTrabalhadas = 220;
        int horasExtrasTrabalhadas = 50;

        Funcionario funcionario = new Funcionario();
        funcionario.quantidadeDeFilhos = 2;
        funcionario.nome = "Mário dos Santos";

        ContratoDeTrabalho contratoDeTrabalho = new ContratoDeTrabalho();
        contratoDeTrabalho.valorHoraNormal = 18.1;
        contratoDeTrabalho.valorHoraExtra = 27.2;
        contratoDeTrabalho.funcionario = funcionario;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(horasNormaisTrabalhadas, horasExtrasTrabalhadas, contratoDeTrabalho);
        System.out.printf(holerite.toString());

    }
}
