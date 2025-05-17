package model;

import java.util.List;

public class ProjetoGenerico extends Projeto{

    public ProjetoGenerico() {
    }

    public ProjetoGenerico(int id, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, List<Tarefa> tarefasProjeto) {
        super(id, tituloProjeto, descricaoProjeto, publicoOuNao, statusProjeto, tarefasProjeto);
    }

    public ProjetoGenerico(int id, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao) {
        super(id, tituloProjeto, descricaoProjeto, publicoOuNao);
    }


}
