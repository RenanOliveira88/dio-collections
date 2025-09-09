package br.edu.dio.exercicios.map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagem;

    public ContagemPalavras(){
        this.contagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.contagem.remove(palavra);
    }
    public void exibirContagem(){
        for(Map.Entry<String, Integer> entry : contagem.entrySet()){
            System.out.println("Palavra: %s, Contagem: %d".formatted(entry.getKey(), entry.getValue()));
        }
    }
    public void encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry :  this.contagem.entrySet()) {
            if (entry.getValue() > maiorContagem){
                palavraMaisFrequente = entry.getKey();
                maiorContagem = entry.getValue();
            }
        }
        if (palavraMaisFrequente != null) {
            System.out.println("Palavra mais frequente: %s, Contagem: %d".formatted(palavraMaisFrequente, maiorContagem));
        } else {
            System.out.println("Nenhuma palavra encontrada.");
        }
    }
}
