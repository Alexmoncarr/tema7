package vuelos;

import aeropuertoSVQ.personal.Pasajero;
import aeropuertoSVQ.personal.Piloto;

import java.util.ArrayList;

public class Vuelo {

    String origen;
    String destino;
    Piloto piloto;
    ArrayList<Pasajero> pasajeros;
    double duracion;

    public Vuelo() {
    }

    public Vuelo(String origen, String destino, Piloto piloto, double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.duracion = duracion;
        pasajeros = new ArrayList<Pasajero>();
    }

    public void agregarPasajero(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        String result = "Vuelo de " + origen + " a " + destino + " con duración de " + duracion + " horas.\n";
        result += "Piloto: " + piloto + "\n";
        result += "Pasajeros: [";
        for (int i = 0; i < pasajeros.size(); i++) {
            result += pasajeros.get(i).toString();
            if (i < pasajeros.size() - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}

