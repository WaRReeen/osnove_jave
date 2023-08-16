package d15_08_2023;

public class slackBoje {

        public static void main(String[] args) {

            int originalRed = 140;
            int originalGreen = 12;
            int originalBlue = 100;


            int contrastRed = 255 - originalRed;
            int contrastGreen = 255 - originalGreen; git commit -m "Add slack colours practice"

            int contrastBlue = 255 - originalBlue;


            System.out.println("Originalna boja: RGB(" + originalRed + ", " + originalGreen + ", " + originalBlue + ")");
            System.out.println("Kontrastna boja: RGB(" + contrastRed + ", " + contrastGreen + ", " + contrastBlue + ")");
        }
    }

