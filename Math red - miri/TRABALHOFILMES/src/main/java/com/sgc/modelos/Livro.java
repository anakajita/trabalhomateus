package com.sgc.modelos;

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;

    // Construtor vazio
    public Livro() {
    }

    // Construtor com parâmetros
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }

    // Método específico
    public String verificarClassificacao() {
        if (anoPublicacao < 2000) {
            return "Livro considerado clássico.";
        } else {
            return "Livro considerado contemporâneo.";
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // toString
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}