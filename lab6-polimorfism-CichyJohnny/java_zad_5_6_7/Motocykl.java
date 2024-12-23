package java_zad_5_6_7;

public class Motocykl extends Pojazd {

    @Override
    public void przyspiesz() {
        v += 20;
    }

    @Override
    public void zatrzymaj() {
        v -= 20;
    }

    public static void main(String[] args) {
        Motocykl motocykl = new Motocykl();
        motocykl.przyspiesz();
        motocykl.printV();
        motocykl.zatrzymaj();
        motocykl.printV();
    }
}
