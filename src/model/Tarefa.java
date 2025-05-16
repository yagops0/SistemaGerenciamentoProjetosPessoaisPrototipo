package model;

public class Tarefa {

    private int id = 0;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private boolean status;

    public Tarefa(String titulo, String descricao, Prioridade prioridade, boolean status) {
        this.id += 1;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " TITULO: " + this.titulo + " DESC: " + this.descricao + " Prior: " +  this.prioridade.toString() + " status: " + this.status;
    }
}
