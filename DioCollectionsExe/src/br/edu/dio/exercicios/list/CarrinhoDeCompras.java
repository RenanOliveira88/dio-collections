package br.edu.dio.exercicios.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }
    public void removerItem(Item item){
        this.itens.remove(item);
    }
    public Double CalcularValorTotal(){
        Double valorTotal = 0.0;

        for (Item item:itens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for (Item item: itens){
            System.out.println(item.toString());
        }
    }
}
