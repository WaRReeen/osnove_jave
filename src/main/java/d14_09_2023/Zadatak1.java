package d14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student = new Student("22/2015", "Marko Peric", "Osnovne");
        student.dodajIspit(new Ispit("Matematika", 8, "Profa1"));
        student.dodajIspit(new Ispit("Fizika", 7, "Profa2"));
        student.dodajIspit(new Ispit("Informatika", 9, "Profa3"));

        student.stampajStudenta();
    }
}
