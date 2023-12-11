package cz.fei.upce;

public class Brankar extends Hrac {
    private int pocetObrdzenychBranek;
    private int pocetChycenychStrel;

    public Brankar(String nazevTymu, int pocetVstrelenychBranek, int pocetOdehranychMinut, int cisloDresu, int pocetAsistenciNaVstreleneBranky, String jmeno, int pocetObrdzenychBranek, int pocetChycenychStrel) {
        super(nazevTymu, pocetVstrelenychBranek, pocetOdehranychMinut, cisloDresu, pocetAsistenciNaVstreleneBranky, jmeno);
        this.pocetObrdzenychBranek = pocetObrdzenychBranek;
        this.pocetChycenychStrel = pocetChycenychStrel;
    }

    public int getPocetObrdzenychBranek() {
        return pocetObrdzenychBranek;
    }

    public void setPocetObrdzenychBranek(int pocetObrdzenychBranek) {
        this.pocetObrdzenychBranek = pocetObrdzenychBranek;
    }

    public int getPocetChycenychStrel() {
        return pocetChycenychStrel;
    }

    public void setPocetChycenychStrel(int pocetChycenychStrel) {
        this.pocetChycenychStrel = pocetChycenychStrel;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "pocetObrdzenychBranek=" + pocetObrdzenychBranek + "\n" +
                ", pocetChycenychStrel=" + pocetChycenychStrel + "\n" +
                '}';
    }
}
