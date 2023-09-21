package d18_09_2023;

class AudioControl extends Control {
    private boolean pojacavanje;

    public AudioControl(boolean pojacavanje) {
        this.pojacavanje = pojacavanje;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int novaJacina = videoPlayer.getJacinaZvuka() + (pojacavanje ? 1 : -1);
        if (novaJacina >= 0 && novaJacina <= 100) {
            videoPlayer.setJacinaZvuka(novaJacina);
        } else {
            System.out.println("Neispravna promena jacine zvuka.");
        }
    }
}
