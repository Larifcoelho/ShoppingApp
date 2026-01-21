import src.com.br.Carrinho;
import src.com.br.Produto;

import java.util.Scanner;

public class Caixa {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();

        while (true) {
            System.out.println("Digite o nome do produto abaixo (ou 'sair' para finalizar)");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Digite o valor do produto abaixo: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nome, preco);
            carrinho.adicionarProduto(produto);

            System.out.println("Produto adicionado com sucesso!\n");
        }

        double total = carrinho.calcularTotal();
        System.out.println("Total da compra: R$ " + total);

    }
}
