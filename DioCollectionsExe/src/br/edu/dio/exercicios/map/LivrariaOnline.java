package br.edu.dio.exercicios.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    Map<String, Livro> catalogo;

    public LivrariaOnline(){
        this.catalogo = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        this.catalogo.put(link, livro);
    }

    public void removerLivro(String titulo){
        //Se pudessemos usar Stream
        //this.catalogo.values().removeIf(livro -> livro.titulo.equals(titulo));

        Livro livroARemover = new Livro(titulo, "", 0);
        for (Map.Entry<String,Livro> entry : this.catalogo.entrySet()){
            if (entry.getValue().equals(livroARemover)){
                this.catalogo.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> catalogoOrdenado = new ArrayList<>(this.catalogo.entrySet());
        catalogoOrdenado.sort(new LivroOrdemPreco());
        for (Map.Entry<String, Livro> entry : catalogoOrdenado){
            System.out.println("Link: %s, Livro: %s".formatted(entry.getKey(), entry.getValue()));
        }
    }
}
