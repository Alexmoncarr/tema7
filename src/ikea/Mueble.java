package ikea;

public class Mueble extends ProductoHogar{
    private String tipoDeMueble;


    public Mueble(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    //Metodos


    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public void setTipoDeMueble(String tipoDeMueble) {
        this.tipoDeMueble = tipoDeMueble;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "tipoDeMueble='" + tipoDeMueble + '\'' +
                ", tipoDeMetal='" + tipoDeMetal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

