package d12_09_2023.Zadatak2;

public class Zadatak2 {
        public static void main(String[] args) {
            ZeleniKarton[] ispiti = new ZeleniKarton[5];
            ispiti[0] = new ZeleniKarton("Marko Markovic", 12345, "DISKRETNA MATEMATIKA", "Ana Anic", 10);
            ispiti[1] = new ZeleniKarton("Jovan Jovanovic", 23456, "ANALIZA", "Milan Milic", 7);
            ispiti[2] = new ZeleniKarton("Nina Nikolic", 34567, "OOP JAVA", "Ivan Ivanovic", 6);
            ispiti[3] = new ZeleniKarton("Petar Petrovic", 45678, "JAVA", "Dragana Dragutinovic", 9);
            ispiti[4] = new ZeleniKarton("Maja Majic", 56789, "SQL", "Pera Peric", 5);

            for (ZeleniKarton ispit : ispiti) {
                ispit.stampaj();
                System.out.println();
            }

            double sumaOcena = 0;
            int brojIspita = ispiti.length;
            for (ZeleniKarton ispit : ispiti) {
                sumaOcena += ispit.getOcena();
            }
            double prosecnaOcena = sumaOcena / brojIspita;
            System.out.println("Prosecna ocena za sve ispite: " + prosecnaOcena);
        }
    }

