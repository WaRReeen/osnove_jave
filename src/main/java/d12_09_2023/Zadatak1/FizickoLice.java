package d12_09_2023.Zadatak1;

class FizickoLice {
    private String imePrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean kupioNekretninu;
    public FizickoLice(String imePrezime, String brojLicneKarte, String jmbg) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.kupioNekretninu = false;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isKupioNekretninu() {
        return kupioNekretninu;
    }

    public void setKupioNekretninu(boolean kupioNekretninu) {
        this.kupioNekretninu = kupioNekretninu;
    }

    public void stampaj() {
        System.out.println(imePrezime + ", Broj licne karte: " + brojLicneKarte);
    }
}
