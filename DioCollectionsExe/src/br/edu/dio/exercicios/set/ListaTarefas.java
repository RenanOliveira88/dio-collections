package br.edu.dio.exercicios.set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa){
        Tarefa tarefaRemover = new Tarefa(tarefa);
        this.tarefas.remove(tarefaRemover);
    }

    public void exibirTarefa(){
        System.out.println(this.tarefas);
    }

    public void contarTarefas(){
        System.out.println("Total de tarefas: " + this.tarefas.size());
    }

    public void obterTarefasConcluidas(){
        for(Tarefa tarefa: this.tarefas){
            if (tarefa.isConcluida()){
                System.out.println(tarefa);
            }
        }
    }
    public void obterTarefasPendentes(){
        for (Tarefa tarefa: this.tarefas){
            if (!tarefa.isConcluida()){
                System.out.println(tarefa);
            }
        }
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa: this.tarefas){
            if (tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa: this.tarefas){
            if (tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        this.tarefas.clear();
    }
}
