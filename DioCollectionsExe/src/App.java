
import br.edu.dio.exercicios.list.CarrinhoDeCompras;
import br.edu.dio.exercicios.list.Item;
import br.edu.dio.exercicios.list.SomaNumeros;

public class App {
    public static void main(String[] args) throws Exception {

        //chamarCarrinhoDeComprar();
        chamarSomaNumeros();

        

    }
    private static void chamarCarrinhoDeComprar(){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Item item1 = new Item("Banana", 0.99, 3);
        Item item2 = new Item("Maçã", 1.20 , 5);

        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);

        carrinho.exibirItens();
        System.out.printf("Total: %.2f\n", carrinho.CalcularValorTotal());

        carrinho.removerItem(item2);

        carrinho.exibirItens();
        System.out.printf("Total: %.2f\n", carrinho.CalcularValorTotal());
    }
    
    private static void chamarSomaNumeros(){
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);

        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();

        somaNumeros.exibirNumero();
    }
}
