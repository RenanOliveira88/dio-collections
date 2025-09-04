package br.edu.dio.exercicios.set;

public class Aluno implements Comparable<Aluno> {
    String nome;
    long matricula;
    long nota;

    public Aluno(String nome, long matricula, long nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.nome);
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}
