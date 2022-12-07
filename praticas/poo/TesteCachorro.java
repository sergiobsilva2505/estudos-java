
package praticas.poo;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro peri = new Cachorro("Peri", "rotweiler", Sexo.MACHO, 2);
        Cachorro laika = new Cachorro("Laika", "mimosa", Sexo.FEMEA, 3);

        System.out.println(peri);
        System.out.println(laika);
    }
}
