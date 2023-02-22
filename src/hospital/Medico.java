package hospital;

public class Medico extends Trabajador{
    private int numeroColegiado;
    private int numeroPaciente;
    private Especialidad especialidad;

    public Medico() {
    }

    public Medico(String nombre, int id, double sueldo, int numeroColegiado, int numeroPaciente, Especialidad especialidad) {
        super(nombre, id, sueldo);
        this.numeroColegiado = numeroColegiado;
        this.numeroPaciente = numeroPaciente;
        this.especialidad = especialidad;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public int getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "numeroColegiado=" + numeroColegiado +
                ", numeroPaciente=" + numeroPaciente +
                ", especialidad=" + especialidad +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", sueldo=" + sueldo +
                '}';
    }
}
