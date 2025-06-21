public class Notificacoes {
    private int notificacoes;

    public Notificacoes(){

    }

    public int getValorFinalNotificacoes (){
        int valorFinal = 0;
        for(int i = 1; i<= 5; i++) {
            if (i % 2 == 0) {
               notificacoes += 2;

            } else {
                notificacoes++;
            }
        }
        valorFinal = notificacoes;
        return valorFinal;
    }

    
}
