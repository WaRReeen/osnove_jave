package p24_08_2023;
//Napisati program koji validira registracionu formu. Program treba da održava 2 niza informacija:
//        **Niz polja za registraciju**: Ovaj niz treba da sadrži nazive polja koja se pojavljuju u registracionoj formi.
//
//        **Niz obaveznih polja**: Ovaj niz treba da sadrži za svako polje informaciju da li je polje obavezno za popunjavanje ili ne. Ako je odgovarajuća vrednost `true`, to znači da je polje obavezno. Ako je vrednost `false`, polje nije obavezno.

import java.util.ArrayList;
public class Zadatak8 {
        public static void main(String[] args) {
            ArrayList<String> poljaZaRegistraciju = new ArrayList<>();
            poljaZaRegistraciju.add("first name");
            poljaZaRegistraciju.add("last name");
            poljaZaRegistraciju.add("email");
            poljaZaRegistraciju.add("password");
            poljaZaRegistraciju.add("phone");
            poljaZaRegistraciju.add("address");

            ArrayList<Boolean> obaveznaPolja = new ArrayList<>();
            obaveznaPolja.add(true);
            obaveznaPolja.add(true);
            obaveznaPolja.add(true);
            obaveznaPolja.add(true);
            obaveznaPolja.add(false);
            obaveznaPolja.add(false);

            for (int i = 0; i < poljaZaRegistraciju.size(); i++) {
                String polje = poljaZaRegistraciju.get(i);
                boolean obavezno = obaveznaPolja.get(i);

                System.out.print(polje + ": ");
                if (obavezno) {
                    System.out.println("* _______________________");
                } else {
                    System.out.println("_______________________");
                }
            }
        }
    }


