package fag;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void mostrarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }
}
