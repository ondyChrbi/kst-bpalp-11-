package cz.fei.upce;

import java.util.Arrays;

public class Tym {
    private static final int DEFAULT_SIZE = 3;
    private Hrac[] hraci;
    private int aktualniIndex;

    public Tym() {
        this.hraci = new Hrac[DEFAULT_SIZE];
        this.aktualniIndex = 0;
    }

    public void pridejHrace(Hrac hrac) {
        if (this.aktualniIndex == this.hraci.length) {
            int novaVelikost = this.hraci.length * 2;
            this.hraci = Arrays.copyOf(this.hraci, novaVelikost);
        }

        this.hraci[aktualniIndex] = hrac;
        ++this.aktualniIndex;
    }

    public void odeberHrace(int cisloDresu) {
        // Najit toho hrace

        Hrac hracKOdebrani = null;
        int indexKOdebrani = -1;

        for (int i = 0; i < this.aktualniIndex; i++) {
            if (this.hraci[i].getCisloDresu() == cisloDresu) {
                hracKOdebrani = this.hraci[i];
                indexKOdebrani = i;

                break;
            }
        }

        this.hraci[indexKOdebrani] = null;

        for (int i = indexKOdebrani; i < this.hraci.length - 1; i++) {
            this.hraci[i] = this.hraci[i + 1];
        }

        if (aktualniIndex == this.hraci.length) {
            this.hraci[this.hraci.length - 1] = null;
        }

        --indexKOdebrani;
    }

    public void seradPodleKanadskychBodu() {
        // Bubble sort
        for (int i = 0; i < this.aktualniIndex - 1; i++) {
            for (int j = 0; j < this.aktualniIndex - i - 1; j++) {
                Hrac hrac1 = this.hraci[j];
                Hrac hrac2 = this.hraci[j + 1];

                int kanadskeBody1 = hrac1.getPocetVstrelenychBranek() + hrac1.getPocetAsistenciNaVstreleneBranky();
                int kanadskeBody2 = hrac2.getPocetVstrelenychBranek() + hrac2.getPocetAsistenciNaVstreleneBranky();

                if (kanadskeBody1 < kanadskeBody2) {
                    Hrac temp = this.hraci[j];
                    this.hraci[j] = this.hraci[j + 1];
                    this.hraci[j + 1] = temp;
                }
            }
        }
    }

    public Hrac findMinByPoceOdehranychMinut() {
        Hrac min = this.hraci[0];

        for (int i = 1; i < this.aktualniIndex; i++) {
            if (this.hraci[i].getPocetOdehranychMinut() < min.getPocetOdehranychMinut()) {
                min = this.hraci[i];
            }
        }

        return min;
    }

    public Hrac findByMinPocetChycenychStrel() {
        Brankar min = null;

        for (int i = 1; i < this.aktualniIndex; i++) {
            if (min == null && this.hraci[i] instanceof Brankar) {
                min = (Brankar) this.hraci[i];
                continue;
            }

            if (this.hraci[i] instanceof Brankar) {
                Brankar brankar = (Brankar) this.hraci[i];

                if (brankar.getPocetChycenychStrel() < min.getPocetChycenychStrel()) {
                    min = brankar;
                }
            }
        }

        return min;
    }

    @Override
    public String toString() {
        String vypis = "";

        for (Hrac hrac : this.hraci) {
            if (hrac != null) {
                vypis += hrac.toString() + "\n";
            }
        }

        return "Tym{}" + vypis;
    }
}
