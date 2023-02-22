package aeropuertoSVQ.personal;

public class Trabajador extends Persona{

    double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellidos, String dni, double sueldo) {
        super(nombre, apellidos, dni);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
