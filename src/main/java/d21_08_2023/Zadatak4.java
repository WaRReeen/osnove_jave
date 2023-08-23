package d21_08_2023;

//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart


import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        s.nextLine();

        int likeCount = 0;
        int smileCount = 0;
        int heartCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Reaguj: ");
            String reakcija = scanner.nextLine();

            if (reakcija.equals("like")) {
                likeCount++;
            } else if (reakcija.equals("smile")) {
                smileCount++;
            } else if (reakcija.equals("heart")) {
                heartCount++;
            }
        }

        System.out.println("Summary: like " + likeCount + " | smile " + smileCount + " | heart " + heartCount);

    }
}

