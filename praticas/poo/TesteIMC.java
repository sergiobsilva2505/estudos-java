package praticas.poo;

public class TesteIMC {
    public static void main(String[] args) {
        var calculadoraIMC = new CalculadoraIMC();

        var paciente = new Paciente();
        paciente.peso = 175;
        paciente.altura = 1.82;

        var imc = calculadoraIMC.calcular(paciente);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
