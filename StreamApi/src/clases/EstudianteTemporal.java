package clases;

import java.util.List;

public class EstudianteTemporal {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private List<NumeroCelular> celulares;

    public EstudianteTemporal(String nombre , int edad , Direccion direccion, List<NumeroCelular> celulares){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.celulares = celulares;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public List<NumeroCelular> getCelulares() {
        return celulares;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public void setCelulares(List<NumeroCelular> celulares) {
        this.celulares = celulares;
    }
}
