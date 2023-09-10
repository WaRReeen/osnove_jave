package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost("Milan Jovanovic", "Tea Tairovic fan page", "Prodajem karte za koncert");
        FacebookPost post2 = new FacebookPost("Vladimir Minic", "Kafana kod Vlade", "Sveze pecenje za 15 minuta");

        post1.like();
        post1.like();
        post1.dislike();
        post1.share();

        post2.like();
        post2.like();
        post2.share();

        post1.print();
        post2.print();
    }
}

