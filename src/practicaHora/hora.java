package practicaHora;

public class hora {

    private int hora;
    private int minutos;


    public hora() {
    }

    public hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc (){
        this.hora++;
    }

    public boolean setMinutos (int minutos) {
        boolean res=false;
        if (minutos<59 && minutos>0){
            res=true;
        }
        return res;
    }

    public boolean setHora (int hora) {
        boolean res=false;
        if (hora<23 && hora>0){
            res=true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "hora= " + this.hora + ":" + this.minutos;
    }
}
