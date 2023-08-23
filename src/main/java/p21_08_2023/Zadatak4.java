package p21_08_2023;
//Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju


public class Zadatak4 {
    public static void main(String[] args) {
        int broj = 2;
        int stepen = 7;
        int rezultat = 1;

        for (int i = 1; i <= stepen; i++) {
            rezultat *= broj;
        }

        System.out.println(broj + " na " + stepen + ". stepen je: " + rezultat);
    }
}

