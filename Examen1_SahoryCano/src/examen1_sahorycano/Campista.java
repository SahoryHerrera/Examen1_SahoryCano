
package examen1_sahorycano;

public class Campista extends Personas {
     private String Tipodecampista; 

    public Campista() {
        
    }

    public Campista(String Tipodecampista, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.Tipodecampista = Tipodecampista;
    }

    public String getTipodecampista() {
        return Tipodecampista;
    }

    public void setTipodecampista(String Tipodecampista) {
        this.Tipodecampista = Tipodecampista;
    }

    @Override
    public String toString() {
        return "Campista{" + "Tipodecampista=" + Tipodecampista + '}';
    }
     
}
