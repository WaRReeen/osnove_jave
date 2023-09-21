package d18_09_2023;

class TimeControl extends Control {
    private boolean unapred;

    public TimeControl(boolean unapred) {
        this.unapred = unapred;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int korak = unapred ? 15 : -15;
        int novoVreme = videoPlayer.getTrenutnoVremeVidea() + korak;

        if (novoVreme >= 0 && novoVreme <= videoPlayer.getDuzinaVidea()) {
            videoPlayer.setTrenutnoVremeVidea(novoVreme);
        } else {
            System.out.println("Neispravna promena vremena videa.");
        }
    }
}
