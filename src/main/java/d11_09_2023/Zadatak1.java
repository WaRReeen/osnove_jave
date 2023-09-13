package d11_09_2023;

public class Zadatak1 {

        public static void main(String[] args) {
            Autor autor1 = new Autor("Lav", "Tolstoj");
            Autor autor2 = new Autor("Fjodor", "Dostojevski");

            Knjiga knjiga1 = new Knjiga("123456789", "Rat i mir", 1869, autor1);
            Knjiga knjiga2 = new Knjiga("987654321", "Idiot", 1869, autor2);

            autor1.print();
            knjiga1.print();

            autor2.print();
            knjiga2.print();
        }
    }

