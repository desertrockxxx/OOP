package de.nerdwest.vererbung;

public class Nachbesteller {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.bezeichnung = "Salamipizza";
        pizza.preis = 1.99;
        pizza.artikelnummer = 1;

        nachbestellen(pizza);
    }

    private static void nachbestellen(Ware ware) {
        System.out.println("Bestellung der Ware: " + ware.bezeichnung);
    }

}

