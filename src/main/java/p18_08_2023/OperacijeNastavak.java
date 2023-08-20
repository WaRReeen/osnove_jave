package p18_08_2023;

public class OperacijeNastavak {
    public static void main(String[] args) {

        int a = 10;
        String akcija = "ddd";

        if (akcija.equals("povecaj")) {
            a = a + 10;
        }

        System.out.println(a);


        String x = "#";
        x = x + " 1"; // => "# 1"
        x = x + " 1"; // => "# 1 1"
        x = "2 " + x; // => "2 # 1 1"



        System.out.println(a);
    }
}

