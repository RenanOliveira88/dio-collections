package br.edu.dio.exercicios.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado){
        dicionario.put(palavra, significado);
    }
    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public void pesquisarPalavra(String palavra){
        String significado = dicionario.get(palavra);
        if (significado != null){
            System.out.println("Significado de %s: %s".formatted(palavra, significado));
        }else{
            System.out.println("A palavra %s não foi encontrada no dicionario.".formatted(palavra));
        }
    }
}
