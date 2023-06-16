package Exer1;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new ItemLivro("Duna",99.99,"Frank Herbert"));
        items.add(new ItemCD("D&B", 19.99, 8));
        items.add(new ItemDVD("Filme1", 20.99, 90));
        items.add(new ItemLivro("Livro", 60.0, "Atr"));
        items.add(new ItemDVD("Filme2", 20.99, 90));

        for (Item item : items) {
            System.out.println(item.mostrarDetalhesDoItem());
        }
    }
}
