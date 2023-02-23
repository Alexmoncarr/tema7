package hospital;
public class Pediatra extends Medico {
    double bonificacion;

    public Pediatra(String nombre, int id, double sueldo, int numeroColegiado, int numeroPaciente, Especialidad especialidad, double bonificacion) {
        super(nombre, id, sueldo, numeroColegiado, numeroPaciente, especialidad);
        this.bonificacion = bonificacion;
    }
    @Override
    public double calcularSueldo() {
        double sueldoTotal = sueldo;
        sueldoTotal+=50*(getNumeroPaciente());
        sueldoTotal+=this.bonificacion;
        return sueldoTotal;
    }
}
