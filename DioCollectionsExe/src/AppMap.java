
import br.edu.dio.exercicios.map.ContagemPalavras;
import br.edu.dio.exercicios.map.Dicionario;

public class AppMap {
    public static void main(String[] args) {
        //testarOperacoesBasicas();
        testarPesquisa();
    }

    public static void testarOperacoesBasicas(){
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Uma linguagem de programação.");
        dicionario.pesquisarPalavra("Java");
        dicionario.removerPalavra("Java");
        dicionario.pesquisarPalavra("Java");
    }

    public static void testarPesquisa(){
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java", 5);   
        contagemPalavras.adicionarPalavra("Python", 3);
        contagemPalavras.adicionarPalavra("C++", 2);
        contagemPalavras.exibirContagem();
        contagemPalavras.encontrarPalavraMaisFrequente();
        contagemPalavras.removerPalavra("Java");
        contagemPalavras.exibirContagem();
        contagemPalavras.encontrarPalavraMaisFrequente();

    }
}
