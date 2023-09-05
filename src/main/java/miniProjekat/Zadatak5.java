package miniProjekat;

//5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//        Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//        ●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//        ●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//        Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//        Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//        - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//        Primer izvršenja 1:
//        Unesite dužinu passworda: 10
//        Da li želite da sadrži specijalan karakter: true
//        Generisan password: eD9Kx0e@
//
//        Primer izvršenja 2:
//        Unesite dužinu passworda: 10
//        Da li želite da sadrži specijalan karakter: false
//        Generisan password: eCxdwEeFEx
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dužinu passworda: ");
        int passwordLength = scanner.nextInt();
        System.out.print("Da li želite da sadrži specijalan karakter: ");
        boolean hasSpecialCharacter = scanner.nextBoolean();

        String generatedPassword = generisiPassword(passwordLength, hasSpecialCharacter);
        System.out.println("Generisan password: " + generatedPassword);

    }
    public static char generisiRandomKarakter() {
        ArrayList<Character> elements = new ArrayList<>();
        elements.add('a');
        elements.add('C');
        elements.add('5');
        elements.add('p');
        elements.add('q');
        elements.add('4');
        elements.add('o');
        elements.add('r');
        elements.add('D');
        elements.add('9');
        elements.add('w');
        elements.add('Z');
        elements.add('7');
        elements.add('t');
        elements.add('A');
        elements.add('L');
        elements.add('6');
        elements.add('y');
        Random random = new Random();
        return elements.get(random.nextInt(elements.size()));
    }
    public static char generisiRandomSpecijalanKarakter() {
        ArrayList<Character> specialElements = new ArrayList<>();
        specialElements.add('@');
        specialElements.add('#');
        specialElements.add('&');
        specialElements.add('*');
        specialElements.add('!');
        Random random = new Random();
        return specialElements.get(random.nextInt(specialElements.size()));
    }

    public static String generisiPassword(int passwordLength, boolean hasSpecialSign) {
        StringBuilder password = new StringBuilder();
        for (int i = 1; i <= passwordLength; i++) {
            if (hasSpecialSign && i == passwordLength) {
                password.append(generisiRandomSpecijalanKarakter());
            } else {
                password.append(generisiRandomKarakter());
            }
        }
        return password.toString();
    }
}




