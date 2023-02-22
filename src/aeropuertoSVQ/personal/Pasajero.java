package aeropuertoSVQ.personal;

public class Pasajero extends Persona {

    int numeroPasaporte;


    public Pasajero() {
    }

    public Pasajero(String nombre, String apellidos, String dni, int numeroPasaporte) {
        super(nombre, apellidos, dni);
        this.numeroPasaporte = numeroPasaporte;
    }

    @Override
    public String toString() {
        String result= "Pasajero con numero de pasaporte=" + numeroPasaporte +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                '}';
        return result;
    }
}
