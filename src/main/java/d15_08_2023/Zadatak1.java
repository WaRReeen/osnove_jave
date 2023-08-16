package d15_08_2023;

//1.	Napisati program koji stampa verziju softvera. Verzija softvera se sastoji od major, minor i patch brojeva.
//        Koristan link za verzionisanje softvera. Odstampati na ekranu verziju softvera u formatu:
//        [MAJOR].[MINOR].[PATCH]


import java.sql.SQLOutput;

public class Zadatak1 {
    public static void main(String[] args) {
        int MAJOR = 5;
        int MINOR = 2;
        int PATCH = 4;

        System.out.println("Trenutna verzija softvera je: " + "[" + MAJOR + "]" + "." + "[" + MINOR + "]" + "." + "[" + PATCH + "]" + "." );

    }
}
