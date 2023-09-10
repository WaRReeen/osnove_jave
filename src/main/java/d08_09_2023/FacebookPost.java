package d08_09_2023;

public class FacebookPost {
        public String imePrezimeObjavio;
        public String imePrezimeNaProfilu;
        public String tekstObjave;
        public int brojLajkova;
        public int brojDeljenja;

        public FacebookPost(String imePrezimeObjavio, String imePrezimeNaProfilu, String tekstObjave) {
            this.imePrezimeObjavio = imePrezimeObjavio;
            this.imePrezimeNaProfilu = imePrezimeNaProfilu;
            this.tekstObjave = tekstObjave;
            this.brojLajkova = 0;
            this.brojDeljenja = 0;
        }

        public void like() {
            brojLajkova++;
        }

        public void dislike() {
            if (brojLajkova > 0) {
                brojLajkova--;
            }
        }

        public void share() {
            brojDeljenja++;
        }

        public void print() {
            System.out.println(imePrezimeObjavio + " >>> " + imePrezimeNaProfilu);
            System.out.println(tekstObjave);
            System.out.println("Likes (" + brojLajkova + ") | Shares (" + brojDeljenja + ")");
            System.out.println();
        }
}
