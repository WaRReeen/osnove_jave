package d07_09_2023;

public class Student {
        String ime;
        int brojIndeksa;
        String fakultet;

        public Student(String ime, int brojIndeksa, String fakultet) {
            this.ime = ime;
            this.brojIndeksa = brojIndeksa;
            this.fakultet = fakultet;
        }

        public void ispisiInformacije() {
            System.out.println("Ime: " + ime);
            System.out.println("Broj indeksa: " + brojIndeksa);
            System.out.println("Fakultet: " + fakultet);
        }
    }

