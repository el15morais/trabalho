package fag;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Bem-vindo ao sistema da loja!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar produtos");
            System.out.println("2 - Ver lista de produtos");
            System.out.println("3 - Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.next();
                    
                    System.out.println("Digite o preço do produto:");
                    double preco = sc.nextDouble();
                    
                    if (preco <= 0) {
                        System.out.println("O preço deve ser positivo. Tente novamente.");
                        break;
                    }

                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = sc.nextInt();
             
                    if (quantidade < 0) {
                        System.out.println("A quantidade não pode ser negativa. Tente novamente.");
                        break;
                    }

                    Produto produto = new Produto(nome, preco, quantidade);
                    loja.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    loja.mostrarProdutos();
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("erro.");
            }
        }

        sc.close();
    }
}
