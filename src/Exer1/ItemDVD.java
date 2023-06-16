package Exer1;

public class ItemDVD extends Item {
    private int duracaoMin;
    public ItemDVD(String nome, double preco, int duracaoMin) {
        super(nome, preco);
        this.duracaoMin = duracaoMin;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome:    " + this.nome);
        System.out.println("Preço:   " + this.preco);
        System.out.println("Duração: " + this.duracaoMin + " minutos");
    }
}
