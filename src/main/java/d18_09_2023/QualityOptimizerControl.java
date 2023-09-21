package d18_09_2023;

class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int novaKvalitet = (int) (brzinaInterneta * 10.1);
        if (novaKvalitet >= 1080) {
            videoPlayer.setKvalitetVidea(1080);
        } else if (novaKvalitet >= 720) {
            videoPlayer.setKvalitetVidea(720);
        } else if (novaKvalitet >= 480) {
            videoPlayer.setKvalitetVidea(480);
        } else if (novaKvalitet >= 360) {
            videoPlayer.setKvalitetVidea(360);
        } else if (novaKvalitet >= 240) {
            videoPlayer.setKvalitetVidea(240);
        } else {
            videoPlayer.setKvalitetVidea(144);
        }
    }
}
