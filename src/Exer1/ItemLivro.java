package Exer1;

public class ItemLivro extends Item {
    private final String autor;
    public ItemLivro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return "ItemLivro {" +
                " nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", autor: '" + autor + '\'' +
                '}';
    }
}
