package d14_09_2023;

import java.util.ArrayList;

class Kombinacija {
    private String id;
    private ArrayList<Integer> brojevi;

    public Kombinacija(String id, int broj1, int broj2, int broj3, int broj4, int broj5, int broj6, int broj7) {
        this.id = id;
        this.brojevi = new ArrayList<>();
        brojevi.add(broj1);
        brojevi.add(broj2);
        brojevi.add(broj3);
        brojevi.add(broj4);
        brojevi.add(broj5);
        brojevi.add(broj6);
        brojevi.add(broj7);
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        for (int i = 0; i < brojevi.size(); i++) {
            if (!brojevi.get(i).equals(k.getBrojevi().get(i))) {
                return false;
            }
        }
        return true;
    }

    public void stampaj() {
        System.out.println("ID: " + id);
        System.out.print("Brojevi: ");
        for (Integer broj : brojevi) {
            System.out.print(broj + ", ");
        }
        System.out.println();
    }
}
