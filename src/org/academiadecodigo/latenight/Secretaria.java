package org.academiadecodigo.latenight;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Secretaria {

    private Queue<Tarefa> tarefas;  //a queue organiza e vai botando fora por orden
    private ListaTelefonica listaTelefonica;

    public Secretaria(){
        tarefas = new PriorityQueue<>();  //o de cima aqui
        listaTelefonica = new ListaTelefonica();
    }

    public void telefonar(){

        if(tarefas.isEmpty()){
            System.out.println("Não tenho tarefas na lista.");
            return;
        }

       String nome = tarefas.poll().getNome();
       if(listaTelefonica.buscaNumero(nome) == null){
           System.out.println("Sr.Belmiro, o numero do Sr(a) " + nome + " não consta na minha lista telefónica.");
           return;
       }

       String numero = listaTelefonica.buscaNumero(nome);
       System.out.println("Já liguei para o " + nome + "(" + numero + ")");
    }

    public void telefonarTodos(){
        Iterator iterator = tarefas.iterator();
        while(iterator.hasNext()){
            telefonar();
        }
    }

    public void listarTarefas(){
        Iterator iterator = tarefas.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void adicionarContacto(String nome, String numero){
        listaTelefonica.adicionarContacto(nome, numero);
    }

    public void agendarTarefa(String nome, Prioridade prioridade){
        tarefas.offer(new Tarefa(nome, prioridade));
    }

}
