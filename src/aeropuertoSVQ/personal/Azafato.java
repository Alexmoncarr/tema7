package aeropuertoSVQ.personal;

import java.util.ArrayList;

public class Azafato extends Persona{

    double sueldo;
    ArrayList<String>idiomas;

    public Azafato() {
    }

    public Azafato(String nombre, String apellidos, String dni, double sueldo, String idioma) {
        super(nombre, apellidos, dni);
        this.sueldo = sueldo;
        ArrayList<String>idiomas = new ArrayList<String>();
        idiomas.add(idioma);
    }

    public void agregarIdioma(String idioma){
        idiomas.add(idioma);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Azafato{" +
                "idiomas=" + idiomas +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
