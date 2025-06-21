import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2- 3);
        Agendamento agendamento1 = new Agendamento(novaData.getDayOfMonth(), 7);
        System.out.println("\nExercício 1 - Sistema de Agendamento, Qual será a saída:");
        System.out.println(agendamento1);
        System.out.println("==========================================================");
        System.out.println("\nExercício 2 - Plataforma de Estudos, qual será a saida?");
        Avaliacao avaliacao = new Avaliacao(7, 2);
        System.out.println(avaliacao.calculaMedia(avaliacao.getNota(), avaliacao.getPeso()));
        System.out.println("\n==========================================================");
        System.out.println("\nExercício 3 - Cadastro com Sobrecarga, qual será a saída?");
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(x.getQuantidade() + y.getQuantidade());
        System.out.println("\n===========================================================");
        System.out.println("Exercício 4 - Controle de fluxo e operadores, o que será impresso?");
        Tarefa t1 = new Tarefa(4, 8);
        System.out.println(t1.verificaPrioridade(t1.getPrioridade(), t1.getUrgencia()));
        System.out.println("\n===========================================================");
        System.out.println("Exercício 5 - Qual será o valor final de notificações?");
        Notificacoes n1 = new Notificacoes();
        System.out.println(n1.getValorFinalNotificacoes());
        System.out.println("\n============================================================");
        System.out.println("Exercício 6 - Qual será a saída:");
        Horario h1 = new Horario();
        System.out.println(h1.getLista().get(1));
        System.out.println("\n=============================================================");
        System.out.println("Exercício 7 - Constrção de classes e métodos, qual será a saída?");
        Livro l = new Livro();
        l.setTitulo("Java para Iniciantes");
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
        System.out.println("\n===============================================================");
        System.out.println("Exercício 8 - Construtores e instâncias, qual das opções instancia corretamente um objeto da classe Usuario?");
        Usuario u = new Usuario("João", 25);
        System.out.println("Usuario u = new Usuario(João, 25);");
        System.out.println("\n================================================================");
        System.out.println("Exercício 11");
        LocalDate hoje = LocalDate.of(2025,6,9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);
        System.out.println("\n=================================================================");
        System.out.println("Exercício 12 - Cálculo de dias úteis com LocalDate Qual será a data impressa?");
        DiasUteis diaUteis = new DiasUteis();
        System.out.println(diaUteis.verificaDiasUteis());
        System.out.println("\n=================================================================");
        System.out.println("Exercício 13 - Verificação de horário com LocalTime O que será impresso?");
        Horario horario1 = new Horario();
        System.out.println(horario1.verificaHorario());
        System.out.println("\n===================================================================");
        System.out.println("Exercício 14 - Ordenação de tarefas com Comparable Qual será a saída após a ordenação?");
        Tarefa tarefa1 = new Tarefa();
        System.out.println(tarefa1.getLista());
        System.out.println("\n====================================================================");
        System.out.println("Exercício 15 - Uso de for com filtro, qual será a saída?");
        Tarefa tarefa2 = new Tarefa();
        System.out.println(tarefa2.verificaTarefaDeProgramacao());
        System.out.println("\n=====================================================================");
        
    }
}
