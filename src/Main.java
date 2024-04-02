import controller.Carro;
import controller.Formula1;
import controller.Piloto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Piloto> pilotos = new ArrayList<>();
        List<Carro> carros = new ArrayList<>();
        List<Formula1> formula1 = new ArrayList<>();

        for (int i = 1; i <= 14; i++) {
            pilotos.add(new Piloto("Piloto " + i));
            carros.add(new Carro("Carro " + i));
        }

        for (int i = 0; i < 14; i++) {
            formula1.add(new Formula1(carros.get(i), pilotos.get(i)));
        }

        for (Formula1 f1 : formula1) {
            f1.start();
        }

        for (Formula1 f1 : formula1) {
            try {
                f1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(pilotos);
        System.out.println("Grid de Largada:");
        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println((i + 1) + ". " + pilotos.get(i).getNome() + " - Melhor volta: " + pilotos.get(i).getMelhorVolta() + " segundos");
        }
    }
}