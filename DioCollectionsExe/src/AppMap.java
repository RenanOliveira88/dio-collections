
import br.edu.dio.exercicios.map.Dicionario;

public class AppMap {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Uma linguagem de programação.");
        dicionario.pesquisarPalavra("Java");
        dicionario.removerPalavra("Java");
        dicionario.pesquisarPalavra("Java");
    }
}
