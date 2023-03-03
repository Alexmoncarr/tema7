package ikea;

public abstract class ProductoHogar extends Producto{
    protected String tipoDeMetal;

    //Constructor
    public ProductoHogar(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    //Metodos


    public String getTipoDeMetal() {
        return tipoDeMetal;
    }

    public void setTipoDeMetal(String tipoDeMetal) {
        this.tipoDeMetal = tipoDeMetal;
    }

    @Override
    public String toString() {
        return "ProductoHogar{" +
                "tipoDeMetal='" + tipoDeMetal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
