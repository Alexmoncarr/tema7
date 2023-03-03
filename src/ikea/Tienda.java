package ikea;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto>productos;

    //Constructor

    public Tienda(ArrayList<Producto> productos) {
        productos=new ArrayList<Producto>();
    }


    //Metodos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void getProductos() {
        for (Producto producto : productos){
            System.out.println(producto.toString());
        }
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "productos=" + productos +
                '}';
    }
}
