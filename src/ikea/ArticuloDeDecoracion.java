package ikea;

public class ArticuloDeDecoracion extends ProductoHogar{


    //Constructor
    public ArticuloDeDecoracion(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    //Metodos
    @Override
    public String toString() {
        return "ArticuloDeDecoracion{" +
                "tipoDeMetal='" + tipoDeMetal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
