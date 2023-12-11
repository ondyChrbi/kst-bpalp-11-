package cz.fei.upce;

public class HokejHlavniProgram {
    public static void main(String[] args) {
        Hrac hrac = new HracVPoli(
                "Feikari",
                5,
                100,
                4,
                1,
                "OndyChrbi",
                Pozice.UTOCNIK
        );
        Hrac hrac2 = new HracVPoli(
                "Feikari",
                8,
                56,
                3,
                1,
                "DavidLe",
                Pozice.OBRANCE
        );
        Hrac hrac3 = new Brankar(
                "Feikari",
                1,
                500,
                9,
                2,
                "VitekRais",
                0,
                150
        );
        Hrac hrac4 = new Brankar(
                "Feikari",
                1,
                500,
                9,
                2,
                "VitekRais 2",
                0,
                170
        );

        Tym tym = new Tym();

        tym.pridejHrace(hrac);
        tym.pridejHrace(hrac2);
        tym.pridejHrace(hrac3);
        tym.pridejHrace(hrac4);

        tym.odeberHrace(3);

        System.out.println("Brankar min pocet strel " + tym.findByMinPocetChycenychStrel());
    }
}