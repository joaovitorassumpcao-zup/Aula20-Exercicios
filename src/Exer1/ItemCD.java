package Exer1;

public class ItemCD extends Item {
    private int numeroFaixas;
    public ItemCD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome:    " + this.nome);
        System.out.println("Preço:   " + this.preco);
        System.out.println("Faixas:  " + this.numeroFaixas);
    }
}
