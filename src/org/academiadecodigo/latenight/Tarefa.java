package org.academiadecodigo.latenight;

public class Tarefa implements Comparable<Tarefa> {

    private String nome;
    private Prioridade prioridade;

    public Tarefa(String nome, Prioridade prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        String string = "esta tarefa chama-se " + nome + " e tem prioridade:" + prioridade;
        return string;
    }

    @Override
    public int compareTo(Tarefa that) {
       return this.prioridade.compareTo(that.prioridade);
    }

    public String getNome() {
        return nome;
    }
}
