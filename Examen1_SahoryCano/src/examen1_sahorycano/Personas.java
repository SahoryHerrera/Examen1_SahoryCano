package examen1_sahorycano;

public class Personas {

    private String nombre;
    private int edad;
    private String sexo;
    private String estado;

    public Personas() {
    }

    public Personas(String nombre, int edad, String sexo,String estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
     public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = estado;
    }

    @Override
     public String toString() {
        return nombre;
    }

}
