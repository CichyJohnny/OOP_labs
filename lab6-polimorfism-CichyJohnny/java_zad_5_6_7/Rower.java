package java_zad_5_6_7;

public class Rower extends Pojazd {

    @Override
    public void przyspiesz() {
        v += 5;
    }

    @Override
    public void zatrzymaj() {
        v -= 5;
    }

    public static void main(String[] args) {
        Rower rower = new Rower();
        rower.przyspiesz();
        rower.printV();
        rower.zatrzymaj();
        rower.printV();
    }
}
