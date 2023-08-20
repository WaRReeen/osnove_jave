package d17_08_2023;
//Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna
//        i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        double a = s.nextDouble();

        System.out.print("Unesite b: ");
        double b = s.nextDouble();

        System.out.print("Unesite operator (+, -, *, /): ");
        String operator = s.next();

        double rezultat = 0.0;

        if (operator.equals("+")) {
            rezultat = a + b;
        } else if (operator.equals("-")) {
            rezultat = a - b;
        } else if (operator.equals("*")) {
            rezultat = a * b;
        } else if (operator.equals("/")) {
            if (b != 0) {
                rezultat = a / b;

                System.out.println("Rezultat: " + rezultat);
            }


            }

        }
    }






