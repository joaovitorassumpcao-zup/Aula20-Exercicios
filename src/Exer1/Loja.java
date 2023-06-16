package Exer1;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new ItemLivro("Duna",99.99,"Frank Herbert"));
        items.add(new ItemCD());
        items.add(new ItemDVD());
        items.add(new ItemLivro());
        items.add(new ItemDVD());
    }
}
