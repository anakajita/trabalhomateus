package com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.sgc.modelos.Livro;

public class Main {

    private static ArrayList<Livro> livros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> listarLivros();
                case 3 -> buscarLivro();
                case 0 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE LIVROS ===");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Buscar Livro por título");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro() {
        System.out.println("\n=== CADASTRAR LIVRO ===");

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Número de Páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(titulo, autor, anoPublicacao, numeroPaginas);
        livros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivros() {
        System.out.println("\n=== LISTA DE LIVROS ===");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    private static void buscarLivro() {
        System.out.println("\n=== BUSCAR LIVRO ===");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.print("Digite o título do livro: ");
        String tituloBusca = scanner.nextLine();

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                System.out.println("Livro encontrado:");
                System.out.println(livro);
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }
}