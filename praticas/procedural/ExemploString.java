package praticas.procedural;

public class ExemploString {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;    
        
        // nesse caso o compilador não faz a soma, pois entende que se trata de uma string e concatena todos os valoes
        System.out.println("Resultado => " + x + y);
        //  nesse caso o compilador soma o x + y e concatena a soma ao restante da string
        System.out.println(x + y + " foi o resultado.");
        // para que ele faça a soma é preciso colocar as variaveis que devem ser somadas entre parenteses.
        System.out.println("Resultado => " + (x + y));
    }
}