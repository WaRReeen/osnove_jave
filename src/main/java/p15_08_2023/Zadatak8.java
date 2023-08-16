package p15_08_2023;

//Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26

public class Zadatak8 {
    public static void main(String[] args) {

        int a = 8;
        int r = 4;
        double PI = 3.14;
        double Pkvadrata = a * a;
        double Pkruga = r * r * PI;
        System.out.println("Povrsina kvadrata je: " + Pkvadrata);
        System.out.println("Povrsina kruga je: " + Pkruga);

    }
}
