package d18_08_2023;
//Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red.
//        Zadatak resiti pomocu FOR petlje.

public class Zadatak4 {
    public static void main(String[] args) {
        int brojCrtica = 25;

        for (int i = 1; i <= brojCrtica; i++) {
            System.out.print("_ ");

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}

