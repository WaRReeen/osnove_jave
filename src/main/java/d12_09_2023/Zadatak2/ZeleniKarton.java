package d12_09_2023.Zadatak2;

class ZeleniKarton {
    private String imePrezimeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;

    public ZeleniKarton(String imePrezimeStudenta, int brojIndeksa, String nazivPredmeta,
                        String imePrezimeProfesora, int ocena) {
        this.imePrezimeStudenta = imePrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImePrezimeStudenta() {
        return imePrezimeStudenta;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }
    public boolean isIspitPolozen() {
        return ocena > 5;
    }

    public void stampaj() {
        System.out.println(nazivPredmeta + " - " + ocena);
        System.out.println("Student: " + imePrezimeStudenta + ", " + brojIndeksa);
        System.out.println("Profesor: " + imePrezimeProfesora);
    }
}
