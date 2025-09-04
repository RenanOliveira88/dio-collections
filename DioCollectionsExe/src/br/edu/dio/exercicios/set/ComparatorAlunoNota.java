package br.edu.dio.exercicios.set;

import java.util.Comparator;

public class ComparatorAlunoNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.nota, a2.nota);
    }
}