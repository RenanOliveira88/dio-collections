import br.edu.dio.exercicios.set.Aluno;
import br.edu.dio.exercicios.set.ConjuntoPalavrasUnicas;
import br.edu.dio.exercicios.set.GerenciadorAlunos;
import br.edu.dio.exercicios.set.ListaTarefas;

public class AppSet {
    public static void main(String[] args) {
        
        //testarConjuntoPalavrasUnicas();

        //testarListaTarefas();

        testarGerenciadorAlunos();


    }

    private static void testarConjuntoPalavrasUnicas(){
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        
        conjunto.adicionarPalavra("Pato");
        conjunto.adicionarPalavra("Pato");
        conjunto.adicionarPalavra("Ganso");
        conjunto.adicionarPalavra("Rã");
        conjunto.adicionarPalavra("Tigre");
        conjunto.adicionarPalavra("Pato");
        conjunto.adicionarPalavra("Gavião");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Ganso");
        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("Rã");

        conjunto.verificarPalavra("Tatu");
    }
    private static void testarListaTarefas(){
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Ler um livro");

        lista.exibirTarefa();

        lista.marcarTarefaConcluida("Estudar Java");
        lista.obterTarefasConcluidas();

        lista.marcarTarefaPendente("Fazer exercícios");
        lista.obterTarefasPendentes();

        lista.contarTarefas();

        lista.limparListaTarefas();
        lista.contarTarefas();
    }
    private static void testarGerenciadorAlunos(){
        
        Aluno a1 = new Aluno("Pedro", 123, 85); 
        Aluno a2 = new Aluno("Ana", 124, 90);
        Aluno a3 = new Aluno("João", 125, 78);

        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAlunos(a1);
        gerenciador.adicionarAlunos(a2);
        gerenciador.adicionarAlunos(a3);

        gerenciador.exibirAlunosPorNome();
        
        gerenciador.exibirAlunosPorNota();
        
        gerenciador.removerAluno(124L);
        
        gerenciador.exibirAlunos();

    }  
}
