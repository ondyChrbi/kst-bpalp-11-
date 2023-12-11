package cz.fei.upce;

public abstract class Hrac {
    private String nazevTymu;
    private int pocetVstrelenychBranek;
    private int pocetOdehranychMinut;
    private int cisloDresu;
    private int pocetAsistenciNaVstreleneBranky;
    private final String jmeno;

    protected Hrac(String nazevTymu, int pocetVstrelenychBranek, int pocetOdehranychMinut, int cisloDresu, int pocetAsistenciNaVstreleneBranky, String jmeno) {
        this.nazevTymu = nazevTymu;
        this.pocetVstrelenychBranek = pocetVstrelenychBranek;
        this.pocetOdehranychMinut = pocetOdehranychMinut;
        this.cisloDresu = cisloDresu;
        this.pocetAsistenciNaVstreleneBranky = pocetAsistenciNaVstreleneBranky;
        this.jmeno = jmeno;
    }

    public String getNazevTymu() {
        return nazevTymu;
    }

    public void setNazevTymu(String nazevTymu) {
        this.nazevTymu = nazevTymu;
    }

    public int getPocetVstrelenychBranek() {
        return pocetVstrelenychBranek;
    }

    public void setPocetVstrelenychBranek(int pocetVstrelenychBranek) {
        this.pocetVstrelenychBranek = pocetVstrelenychBranek;
    }

    public int getPocetOdehranychMinut() {
        return pocetOdehranychMinut;
    }

    public void setPocetOdehranychMinut(int pocetOdehranychMinut) {
        this.pocetOdehranychMinut = pocetOdehranychMinut;
    }

    public int getCisloDresu() {
        return cisloDresu;
    }

    public void setCisloDresu(int cisloDresu) {
        this.cisloDresu = cisloDresu;
    }

    public int getPocetAsistenciNaVstreleneBranky() {
        return pocetAsistenciNaVstreleneBranky;
    }

    public void setPocetAsistenciNaVstreleneBranky(int pocetAsistenciNaVstreleneBranky) {
        this.pocetAsistenciNaVstreleneBranky = pocetAsistenciNaVstreleneBranky;
    }

    public String getJmeno() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "Hrac{" + "\n" +
                "nazevTymu='" + nazevTymu + '\'' + "\n" +
                ", pocetVstrelenychBranek=" + pocetVstrelenychBranek + "\n" +
                ", pocetOdehranychMinut=" + pocetOdehranychMinut + "\n" +
                ", cisloDresu=" + cisloDresu + "\n" +
                ", pocetAsistenciNaVstreleneBranky=" + pocetAsistenciNaVstreleneBranky + "\n" +
                ", jmeno='" + jmeno + '\'' + "\n" +
                '}';
    }
}
