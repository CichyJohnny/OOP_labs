package java_zad_5_6_7;

import java.util.ArrayList;

public class zad7 {
    public static void main(String[] args) {
        ArrayList<Pojazd> pojazdy = new ArrayList<Pojazd>();
        pojazdy.add(new Samochod());
        pojazdy.add(new Rower());
        pojazdy.add(new Motocykl());

        for (int i=0; i<3; i++) {
            pojazdy.get(i).przyspiesz();
            pojazdy.get(i).printV();

            pojazdy.get(i).zatrzymaj();
            pojazdy.get(i).printV();
        }
    }
    
}
