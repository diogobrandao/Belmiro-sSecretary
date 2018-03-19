package org.academiadecodigo.latenight;

public class Tester {

    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Trump",Prioridade.ALTA);
        Tarefa tarefa2 = new Tarefa("MUgabe",Prioridade.BAIXA);

        System.out.println(tarefa1);
        System.out.println(tarefa2);
        System.out.println(tarefa1.compareTo(tarefa2));


        ListaTelefonica lt1 = new ListaTelefonica();
        System.out.println("apos criação: " + lt1);
        lt1.adicionarContacto("Sergio", "9123456786");
        lt1.adicionarContacto("Soraia", "9123465435");
        lt1.adicionarContacto("Brandão", "964753268");

        System.out.println("após adicao: "+ lt1);

        System.out.println(lt1.buscaNumero("Sergio"));
        System.out.println(lt1.buscaNumero("noname"));

        Secretaria ester = new Secretaria();

        ester.agendarTarefa("Mário", Prioridade.BAIXA);
        ester.agendarTarefa("Luis", Prioridade.BAIXA);
        ester.agendarTarefa("Sergio", Prioridade.ALTA);
        ester.agendarTarefa("Soraia", Prioridade.MEDIA);

        ester.adicionarContacto("Sergio", "921234567");
        ester.adicionarContacto("Brandão", "921887567");
        ester.adicionarContacto("Soraia", "921234235");
        ester.adicionarContacto("Luis", "926754567");

        ester.listarTarefas();

        ester.telefonarTodos();

    }
}
