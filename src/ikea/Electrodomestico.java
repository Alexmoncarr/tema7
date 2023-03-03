package ikea;

public class Electrodomestico extends ProductoHogar {
    eficienciaEnergetica valor;

    //Constructor
    public Electrodomestico(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    //Metodos

    public eficienciaEnergetica getValor() {
        return valor;
    }

    public void setValor(eficienciaEnergetica valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "valor=" + valor +
                ", tipoDeMetal='" + tipoDeMetal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

