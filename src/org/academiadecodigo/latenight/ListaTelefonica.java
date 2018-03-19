package org.academiadecodigo.latenight;

import java.util.HashMap;
import java.util.Map;

public class ListaTelefonica {

    private Map<String, String> mapa;

    public ListaTelefonica(){
        mapa = new HashMap<>();
    }


    public String buscaNumero(String nome){
       return mapa.get(nome);
    }

    public void adicionarContacto(String nome, String numero){
        mapa.put(nome, numero);
    }

    @Override
    public String toString() {
        return "A minha lista: " + mapa;
    }
}
