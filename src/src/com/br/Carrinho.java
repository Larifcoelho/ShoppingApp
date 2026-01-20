package src.com.br;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
       if (produto == null){
           throw new IllegalArgumentException("Inválido. Digite o valor correto.");
       }
    lista.add (produto);
}
    public double calcularTotal(){
        double total = 0;
        for (Produto p : lista){
            total += p.getPreco();
        } return total;
    }
    }

