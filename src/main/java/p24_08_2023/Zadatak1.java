package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.




import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(13);
        niz.add(24);
        niz.add(33);
        niz.add(48);
        niz.add(55);

        int suma = niz.get(0) + niz.get(niz.size() - 1);

        System.out.println("Suma nultog i zadnjeg elementa niza je: " + suma);
    }
}
