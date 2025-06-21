import java.time.LocalDate;

public class Agendamento {
    private int date;
    private int dias;

    public Agendamento(int date, int dias){
        this.date = date;
        this.dias = dias;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Data: ").append(getDate()).append("\n");
        /*Deixei comentado pois não faz parte da resposta.
        sb.append("Dia: ").append(getDias()).append("\n");*/
        return sb.toString();
}
}
