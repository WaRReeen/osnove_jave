package d18_09_2023;

import java.util.Arrays;

public class Zadatak1 {
        public static void main(String[] args) {

            VideoPlayer videoPlayer = new VideoPlayer(600, 480);
            System.out.println("Trenutni podaci:");
            videoPlayer.stampaj();

            ((Control) new TimeControl(false)).izvrsiAkciju(videoPlayer);
            System.out.println("\nNakon izvršene akcije:");
            videoPlayer.stampaj();
            ((Control) new AudioControl(true)).izvrsiAkciju(videoPlayer);
            System.out.println("\nNakon izvršene akcije:");
            videoPlayer.stampaj();
            ((Control) new QualityOptimizerControl(15.0)).izvrsiAkciju(videoPlayer);
            System.out.println("\nNakon izvršene akcije:");
            videoPlayer.stampaj();
        }
    }

