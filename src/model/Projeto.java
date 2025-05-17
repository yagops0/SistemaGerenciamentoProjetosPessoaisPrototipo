package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Projeto {

    private int id;
    private String tipoProjeto;
    private String tituloProjeto;
    private String descricaoProjeto;
    private boolean publicoOuNao;
    private StatusProjeto statusProjeto;
    private List<Tarefa> tarefasProjeto = new ArrayList<>();

    public Projeto() {
    }

    public Projeto(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, List<Tarefa> tarefasProjeto) {
        this.id = id;
        this.tipoProjeto = tipoProjeto;
        this.tituloProjeto = tituloProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.publicoOuNao = publicoOuNao;
        this.statusProjeto = statusProjeto;
        this.tarefasProjeto = tarefasProjeto;
    }

    public Projeto(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto) {
        this.id = id;
        this.tipoProjeto = tipoProjeto;
        this.tituloProjeto = tituloProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.publicoOuNao = publicoOuNao;
        this.statusProjeto = statusProjeto;
    }

    public Projeto(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao) {
        this.id = id;
        this.tipoProjeto = tipoProjeto;
        this.tituloProjeto = tituloProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.publicoOuNao = publicoOuNao;
    }

    public Projeto(int id, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, List<Tarefa> tarefasProjeto) {
        this.id = id;
        this.tituloProjeto = tituloProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.publicoOuNao = publicoOuNao;
        this.statusProjeto = statusProjeto;
        this.tarefasProjeto = tarefasProjeto;
    }

    public Projeto(int id, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao) {
        this.id = id;
        this.tituloProjeto = tituloProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.publicoOuNao = publicoOuNao;
    }

    public int getId() {
        return id;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getTituloProjeto() {
        return tituloProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloProjeto = tituloProjeto;
    }

    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    public void setDescricaoProjeto(String descricaoProjeto) {
        this.descricaoProjeto = descricaoProjeto;
    }

    public boolean isPublicoOuNao() {
        return publicoOuNao;
    }

    public void setPublicoOuNao(boolean publicoOuNao) {
        this.publicoOuNao = publicoOuNao;
    }

    public StatusProjeto getStatusProjeto() {
        return statusProjeto;
    }

    public void setStatusProjeto(StatusProjeto statusProjeto) {
        this.statusProjeto = statusProjeto;
    }

    public List<Tarefa> getTarefasProjeto() {
        return tarefasProjeto;
    }

    public void setTarefasProjeto(List<Tarefa> tarefasProjeto) {
        this.tarefasProjeto = tarefasProjeto;
    }
}
