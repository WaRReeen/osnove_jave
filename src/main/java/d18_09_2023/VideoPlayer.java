package d18_09_2023;

public class VideoPlayer {
    private int duzinaVidea;
    private int trenutnoVremeVidea;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = 0;
        this.jacinaZvuka = 50; // Podesavamo jacinu zvuka na 50% po defaultu
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        if (trenutnoVremeVidea >= 0 && trenutnoVremeVidea <= duzinaVidea) {
            this.trenutnoVremeVidea = trenutnoVremeVidea;
        } else {
            System.out.println("Neispravno vreme videa.");
        }
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        if (jacinaZvuka >= 0 && jacinaZvuka <= 100) {
            this.jacinaZvuka = jacinaZvuka;
        } else {
            System.out.println("Neispravna jacina zvuka.");
        }
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj() {
        System.out.println("Trenutno vreme videa: " + trenutnoVremeVidea);
        System.out.println("Jacina zvuka: " + jacinaZvuka);
        System.out.println("Kvalitet videa: " + kvalitetVidea);
    }
}

