package controller;

public class Carro {
    private String nome;
    private boolean disponivel;

    public Carro(String nome) {
        this.nome = nome;
        this.disponivel = true;
    }

    public synchronized boolean isDisponivel() {
        return disponivel;
    }

    public synchronized void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }
}
