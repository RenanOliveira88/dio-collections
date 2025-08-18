package br.edu.dio.exercicios.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(numeros);
        System.out.println("Números em ordem ascendente: " + numeros);
    }

    public void ordenarDescendente(){
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Números em ordem descendente: " + numeros);
    }
}
