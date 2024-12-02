package models;

public class Persona {

    private String nombre;
    private int edad;
    
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

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void setDatos(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    
}
