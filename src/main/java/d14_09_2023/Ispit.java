package d14_09_2023;

public class Ispit {
        private String nazivPredmeta;
        private int ocena;
        private String imePrezimeProfesora;

        public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesora) {
            this.nazivPredmeta = nazivPredmeta;
            this.ocena = ocena;
            this.imePrezimeProfesora = imePrezimeProfesora;
        }

        public String getNazivPredmeta() {
            return nazivPredmeta;
        }

        public int getOcena() {
            return ocena;
        }

        public void setOcena(int ocena) {
            this.ocena = ocena;
        }

        public String getImePrezimeProfesora() {
            return imePrezimeProfesora;
        }

        public boolean isPolozen() {
            return ocena >= 6 && ocena <= 10;
        }

        public void stampajIspit() {
            System.out.println(nazivPredmeta + " - " + imePrezimeProfesora + " - " + ocena);
        }
    }

