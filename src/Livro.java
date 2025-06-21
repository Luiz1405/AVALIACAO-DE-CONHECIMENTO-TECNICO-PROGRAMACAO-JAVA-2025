public class Livro {
    private String titulo;
    private boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String status(){
        if (emprestado) {
            return "Indispovível";
        }
        return "Dispoível";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
