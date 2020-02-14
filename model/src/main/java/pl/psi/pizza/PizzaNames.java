package pl.psi.pizza;

public enum PizzaNames {
    MARGERITTA("Margeritta"),
    MARINARA("Marinara"),
    NAPOLETANA("Napoleońska"),
    HAWAJSKA("Hawajska"),
    FUNGHI("Funghi"),
    QUATRO("Quatro"),
    CAPRICCIOSA("Capricciosa"),
    DINAMITE("Dynamit");

    private String name;

    PizzaNames(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }
}
