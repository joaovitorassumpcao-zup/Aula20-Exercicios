package Exer1;

public class ItemLivro extends Item {
    private String autor;
    public ItemLivro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome:    " + this.nome);
        System.out.println("Preço:   " + this.preco);
        System.out.println("Autor:   " + this.autor);
    }
}
