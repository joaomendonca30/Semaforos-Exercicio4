package controller;

public class Formula1 extends Thread{
    private Carro carro;
    private Piloto piloto;

    public Formula1(Carro carro, Piloto piloto) {
        this.carro = carro;
        this.piloto = piloto;
    }

    @Override
    public void run() {
        int voltasCompletas = 0;
        while (voltasCompletas < 3) {
            synchronized (carro) {
                if (carro.isDisponivel()) {
                    carro.setDisponivel(false);
                    int tempoVolta = (int) (Math.random() * (120 - 60) + 60);
                    System.out.println(piloto.getNome() + " - Volta " + (voltasCompletas + 1) + ": " + tempoVolta + " segundos");
                    if (tempoVolta < piloto.getMelhorVolta()) {
                        piloto.setMelhorVolta(tempoVolta);
                    }
                    carro.setDisponivel(true);
                    voltasCompletas++;
                }
            }
        }
    }
}
