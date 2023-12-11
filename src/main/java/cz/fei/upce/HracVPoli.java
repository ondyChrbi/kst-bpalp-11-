package cz.fei.upce;

public class HracVPoli extends Hrac {

    private Pozice pozice;

    public HracVPoli(String nazevTymu, int pocetVstrelenychBranek, int pocetOdehranychMinut, int cisloDresu, int pocetAsistenciNaVstreleneBranky, String jmeno, Pozice pozice) {
        super(nazevTymu, pocetVstrelenychBranek, pocetOdehranychMinut, cisloDresu, pocetAsistenciNaVstreleneBranky, jmeno);
        this.pozice = pozice;
    }

    public Pozice getPozice() {
        return pozice;
    }

    public void setPozice(Pozice pozice) {
        this.pozice = pozice;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "pozice=" + pozice + "\n" +
                '}';
    }
}
