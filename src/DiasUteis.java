import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiasUteis {
    private int diasUteis;

    public DiasUteis(){

    }

    public LocalDate verificaDiasUteis(){
        LocalDate data = LocalDate.of(2025, 6, 10);
        
        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemama = data.getDayOfWeek() ==
            DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if(!fimDeSemama && !feriado){
                diasUteis++;
            }
            
        }
        return data;
    }
}
