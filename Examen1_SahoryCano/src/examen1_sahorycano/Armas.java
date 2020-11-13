
package examen1_sahorycano;


public class Armas {
    private String tipo;
    private int daño;

    public Armas(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "tipo=" + tipo + ", da\u00f1o=" + daño + '}';
    }
    
}
