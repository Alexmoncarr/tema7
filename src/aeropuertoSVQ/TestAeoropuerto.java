package aeropuertoSVQ;

import aeropuertoSVQ.personal.Pasajero;
import aeropuertoSVQ.personal.Piloto;
import vuelos.Vuelo;

import static aeropuertoSVQ.personal.Rango.Alpha;

public class TestAeoropuerto {
    public static void main(String[] args) {

        Pasajero pa1 = new Pasajero ("Alejandro","Montalvo Carrasco", "12312312a", 1234);
        Piloto pi1 = new Piloto("Elia", "Lanzas Dorado",
                "12312312a", Alpha, 3000.0, true);
        Vuelo v1 = new Vuelo("Sevilla", "Kiev", pi1,  3.5);
        v1.agregarPasajero(pa1);
        System.out.println(v1.toString());

    }
}