package model;

import java.util.List;

public class ProjetoEstudo extends Projeto{

    private String topico;
    private String assunto;
    private String plataforma;

    public ProjetoEstudo() {
    }

    public ProjetoEstudo(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, List<Tarefa> tarefasProjeto, String topico, String assunto, String plataforma) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao, statusProjeto, tarefasProjeto);
        this.topico = topico;
        this.assunto = assunto;
        this.plataforma = plataforma;
    }

    public ProjetoEstudo(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, StatusProjeto statusProjeto, String topico, String assunto, String plataforma) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao, statusProjeto);
        this.topico = topico;
        this.assunto = assunto;
        this.plataforma = plataforma;
    }

    public ProjetoEstudo(int id, String tipoProjeto, String tituloProjeto, String descricaoProjeto, boolean publicoOuNao, String topico, String assunto, String plataforma) {
        super(id, tipoProjeto, tituloProjeto, descricaoProjeto, publicoOuNao);
        this.topico = topico;
        this.assunto = assunto;
        this.plataforma = plataforma;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
