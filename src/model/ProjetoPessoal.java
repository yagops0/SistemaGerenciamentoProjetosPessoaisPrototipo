package model;

import java.util.List;

public class ProjetoPessoal extends Projeto{

    private String categoria;
    private String motivacao;
    private int tempoEstimado;

    public ProjetoPessoal() {
    }

    public ProjetoPessoal(String categoria, String motivacao, int tempoEstimado) {
        this.categoria = categoria;
        this.motivacao = motivacao;
        this.tempoEstimado = tempoEstimado;
    }

    public ProjetoPessoal(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, List<Tarefa> tarefasProjeto, String categoria, String motivacao, int tempoEstimado) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao, statusProjeto, tarefasProjeto);
        this.categoria = categoria;
        this.motivacao = motivacao;
        this.tempoEstimado = tempoEstimado;
    }

    public ProjetoPessoal(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, String categoria, String motivacao, int tempoEstimado) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao, statusProjeto);
        this.categoria = categoria;
        this.motivacao = motivacao;
        this.tempoEstimado = tempoEstimado;
    }

    public ProjetoPessoal(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, String categoria, String motivacao, int tempoEstimado) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao);
        this.categoria = categoria;
        this.motivacao = motivacao;
        this.tempoEstimado = tempoEstimado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(String motivacao) {
        this.motivacao = motivacao;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
}
