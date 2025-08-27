package br.edu.dio.exercicios.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        this.palavras.add(palavra);
    }
    public void removerPalavra(String palavra){
        this.palavras.remove(palavra);
    }
    public void verificarPalavra(String palavra){
        if(this.palavras.contains(palavra)){
            System.out.println("A palavra " + palavra + " está no conjunto.");
        }else{
            System.out.println("A palavra " + palavra + " não está no conjunto.");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(this.palavras);
    }

}
