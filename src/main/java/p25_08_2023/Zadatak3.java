package p25_08_2023;

//Napisati metodu koja stampa zvezdicu sa razmakom.
//        U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//        *  *  *
//        *  *
//        *


public class Zadatak3  {
    public static void main(String[] args) {
        stampajZvezdeRazmake(3);
        stampajZvezdeRazmake(2);
        stampajZvezdeRazmake(1);
    }

    public static void stampajZvezdeRazmake(int brojZvezdica) {
        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }


}


