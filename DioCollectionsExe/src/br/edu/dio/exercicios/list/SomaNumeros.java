package br.edu.dio.exercicios.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void calcularSoma() {
        int soma = 0;
        for (Integer numero : this.numeros) {
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }

    public void encontrarMaiorNumero() {
        Collections.sort(numeros);
        System.out.println("Maior número: " + numeros.get(numeros.size() - 1));
    }

    public void encontrarMenorNumero() {
        Collections.sort(numeros);
        System.out.println("Menor número: " + numeros.get(0));
    }

    public void exibirNumero() {
        System.out.println(numeros);
    }

}
