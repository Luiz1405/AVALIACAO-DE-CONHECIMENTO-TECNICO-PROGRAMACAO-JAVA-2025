import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    private int prioridade;
    private int urgencia;
    private String titulo;
    private List<Tarefa> tarefas;
    private List<String> tarefas2;

    public Tarefa (){
    this.tarefas = new ArrayList<>();
    this.tarefas2 = new ArrayList<>();
    tarefas2.add("Estudar Java");
    tarefas2.add("Fazer Exercícios");
    tarefas2.add("Revisar Código");
    tarefas.add(new Tarefa("Estudar"));
    tarefas.add(new Tarefa("Almoçar"));
    tarefas.add(new Tarefa("Dormir"));
    Collections.sort(tarefas);
    }

    public Tarefa(String titulo) {
        this.titulo = titulo;
        
    }

    public Tarefa(int prioridade, int urgencia) {
        this.prioridade = prioridade;
        this.urgencia = urgencia;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public int getUrgencia() {
        return urgencia;
    }
    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    public String verificaPrioridade(int prioridade, int urgencia){
        if (prioridade > 3 && urgencia > 7) {
            return "Tarefa crítica";
        } else if (prioridade > 3 || urgencia > 7) {
            return "Tarefa importante";
        } else {
            return "Tarefa comum";
        }
    }

    public String verificaTarefaDeProgramacao(){
        for (String tarefa : tarefas2) {
            if(tarefa.contains("Java")) {
                return "Tarefa de programação: " + tarefa;
            }
        }
        return "Nenhuma tarefa de programação encontrada.";
    }

    public List<Tarefa> getLista(){
        return new ArrayList<>(tarefas);
    }

    public String toString(){
        return getTitulo();  
    }

    
   
}
