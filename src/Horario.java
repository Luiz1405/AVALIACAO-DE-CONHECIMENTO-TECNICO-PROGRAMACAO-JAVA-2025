import java.time.LocalTime;
import java.util.ArrayList;

public class Horario {
    private ArrayList<String> horarios;

    public Horario (){
        this.horarios = new ArrayList<>();
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");
    }

    public ArrayList<String> getLista(){
        return new ArrayList<>(horarios);
    }

    public String verificaHorario(){
        LocalTime envio = LocalTime.of(23,0);
        LocalTime limite = LocalTime.of(22,59);

        if(!envio.isBefore(limite)){
            return "Entrega fora do horário.";
        } else {
            return "Tarefa enviada com sucesso.";
        }
    }
}   
