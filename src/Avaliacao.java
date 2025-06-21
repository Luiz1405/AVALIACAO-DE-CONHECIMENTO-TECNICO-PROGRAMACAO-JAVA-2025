public class Avaliacao {
    private int nota;
    private int peso;

    public Avaliacao(int nota, int peso){
    this.nota = nota;
    this.peso = peso;
}

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String calculaMedia(int nota, int peso){
       double media = (nota * peso + 6 * 3) / 5;
       if(media >= 7.0) {
        return "Aprovado";

       } else {
        return "Revisar conteúdo";
       }
    }
}
