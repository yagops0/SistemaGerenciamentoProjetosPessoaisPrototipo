package model;

public class Tarefa {

    private int id;
    private String tituloTarefa;
    private String descricaoTarefa;
    private Prioridade prioridade;
    private boolean statusTarefa;

    public Tarefa() {
    }


    public Tarefa(int id, String tituloTarefa, String descricaoTarefa, Prioridade prioridade, boolean statusTarefa) {
        this.id = id;
        this.tituloTarefa = tituloTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.prioridade = prioridade;
        this.statusTarefa = statusTarefa;
    }

    public Tarefa(int id, String tituloTarefa, String descricaoTarefa) {
        this.id = id;
        this.tituloTarefa = tituloTarefa;
        this.descricaoTarefa = descricaoTarefa;
    }

    public int getId() {
        return id;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " TITULO: " + this.tituloTarefa + " DESC: " + this.descricaoTarefa + " Prior: " +  this.prioridade.toString() + " status: " + this.statusTarefa;
    }
}
