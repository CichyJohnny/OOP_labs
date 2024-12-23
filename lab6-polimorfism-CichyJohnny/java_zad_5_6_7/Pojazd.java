package java_zad_5_6_7;


abstract class Pojazd {
    public int v = 0;

    public abstract void przyspiesz();
    public abstract void zatrzymaj();

    public void printV() {
        System.out.println("Predkosc: " + v);
    }
}