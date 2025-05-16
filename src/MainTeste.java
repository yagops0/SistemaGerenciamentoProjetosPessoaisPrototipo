import model.Prioridade;
import model.Tarefa;

public class MainTeste {
    public static void main(String[] args) {

        Tarefa t1 = new Tarefa("Teste", "Testando o autoIncrment", Prioridade.ALTA, true);

        System.out.println(t1);
    }
}
