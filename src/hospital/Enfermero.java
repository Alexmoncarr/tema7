package hospital;

public class Enfermero extends NoMedico{
    public Enfermero(String nombre, int id, double sueldo, Puesto puesto, String area) {
        super(nombre, id, sueldo, puesto, area);
    }
    @Override
    public double calcularSueldo() {
        double sueldoTotal = this.sueldo;
        return sueldoTotal;
    }
}
