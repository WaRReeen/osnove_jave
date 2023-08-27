package p25_08_2023;

//Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//        Trougao je pravougli ukoliko je a*a+b*b=c*c


public class Zadatak7 {

    public static boolean daLiJePravougli ( double a, double b, double c) {
        return a * a + b * b == c * c;
    }
    public static void main(String[] args) {
        double stranicaA = 3.3;
        double stranicaB = 4.4;
        double hipotenuzaC = 5.5;

        System.out.println("Vrednosti stranica i hipotenuze:");
        System.out.println("Stranica a: " + stranicaA);
        System.out.println("Stranica b: " + stranicaB);
        System.out.println("Hipotenuza c: " + hipotenuzaC);

        if (daLiJePravougli(stranicaA, stranicaB, hipotenuzaC)) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }


        }

    }




