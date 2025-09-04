package br.edu.dio.exercicios.set;


import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunos = new TreeSet<>();

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(Long matricula){
        for(Aluno aluno: alunos)
            if(aluno.matricula == matricula){
                alunos.remove(aluno);
                break;
            }
    }
    public void exibirAlunosPorNome(){
        System.out.println("Exibindo alunos por nome:");
        for(Aluno aluno: alunos){
            System.out.println(aluno);
        }
        System.out.println("----");
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoNota());
        alunosPorNota.addAll(alunos);
        System.out.println("Exibindo alunos por nota:");
        for(Aluno aluno: alunosPorNota){
            System.out.println(aluno);
        }
        System.out.println("----");

    }
    public void exibirAlunos(){
        System.out.println("Exibindo alunos:");
        for(Aluno aluno: alunos)
            System.out.println(aluno);
        System.out.println("----");
    }
}
