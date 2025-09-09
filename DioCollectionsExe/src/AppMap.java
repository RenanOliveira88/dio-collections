
import br.edu.dio.exercicios.map.ContagemPalavras;
import br.edu.dio.exercicios.map.Dicionario;
import br.edu.dio.exercicios.map.LivrariaOnline;

public class AppMap {
    public static void main(String[] args) {
        //testarOperacoesBasicas();
       // testarPesquisa();
       testarOrdenacao();
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

    public static void testarOrdenacao(){
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("link1", "Java Basics", "Author A", 29.99);
        livraria.adicionarLivro("link2", "Advanced Java", "Author B", 39.99);
        livraria.adicionarLivro("link3", "Python for Beginners", "Author C", 25.99);
        livraria.exibirLivrosOrdenadosPorPreco();
    }
}
