package br.edu.dio.exercicios.map;

import java.util.Comparator;
import java.util.Map;

public class LivroOrdemPreco implements Comparator<Map.Entry<String, Livro>> {

    public LivroOrdemPreco() {
    }
    @Override
    public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
        return Double.compare(e1.getValue().preco, e2.getValue().preco);
    }
}
