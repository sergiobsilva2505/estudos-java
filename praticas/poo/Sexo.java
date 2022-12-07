
package praticas.poo;

public enum Sexo {

    MACHO("Macho"),
    FEMEA("Femea");

    private String display;

    Sexo(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

}
