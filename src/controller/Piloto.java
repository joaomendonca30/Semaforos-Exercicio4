package controller;

public class Piloto implements Comparable<Piloto> {
    private String nome;
    private int melhorVolta;

    public Piloto(String nome) {
        this.nome = nome;
        this.melhorVolta = Integer.MAX_VALUE;
    }

    public synchronized int getMelhorVolta() {
        return melhorVolta;
    }

    public synchronized void setMelhorVolta(int melhorVolta) {
        this.melhorVolta = melhorVolta;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Piloto o) {
        return Integer.compare(this.melhorVolta, o.melhorVolta);
    }
}
