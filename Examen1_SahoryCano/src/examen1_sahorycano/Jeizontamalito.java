
package examen1_sahorycano;

public class Jeizontamalito extends Personas {
    private int cantidad_desaparecidos;

    public Jeizontamalito() {
    }

    public Jeizontamalito(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    public int getCantidad_desaparecidos() {
        return cantidad_desaparecidos;
    }

    public void setCantidad_desaparecidos(int cantidad_desaparecidos) {
        this.cantidad_desaparecidos = cantidad_desaparecidos;
    }

    @Override
    public String toString() {
        return "Jeizontamalito{" + "cantidad_desaparecidos=" + cantidad_desaparecidos + '}';
    }
    
}
