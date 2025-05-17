import model.Prioridade;
import model.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {


        /*Tarefa t1 = new Tarefa("Teste", "Testando o autoIncrment", Prioridade.ALTA, true);
        Tarefa t2 = new Tarefa("Teste2", "Testando o autoIncrment2", Prioridade.BAIXA, false);*/
        List<Tarefa> tarefas = new ArrayList<>();
        char continuar;
        Scanner scan = new Scanner(System.in);
        String desc, titulo;
        int incrementandoId = 0;

        do {
            incrementandoId++;
            System.out.println("title: ");
            titulo = scan.nextLine();

            System.out.println("desc: ");
            desc = scan.nextLine();

            Tarefa t = new Tarefa(incrementandoId, titulo, desc);

            tarefas.add(t);

            System.out.println("Continuar? (s/n)");
            continuar = scan.nextLine().charAt(0);

        }while (Character.toLowerCase(continuar) == 's');

        for (Tarefa t : tarefas){
            System.out.println(t.getId());
            System.out.println(t.getTitulo());
            System.out.println(t.getDescricao());
        }

    }
}
