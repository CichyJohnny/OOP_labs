package java_zad_5_6_7;

public class Samochod extends Pojazd {

    @Override
    public void przyspiesz() {
        v += 30;
    }

    @Override
    public void zatrzymaj() {
        v -= 30;
    }

    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        samochod.przyspiesz();
        samochod.printV();
        samochod.zatrzymaj();
        samochod.printV();
    }
}
