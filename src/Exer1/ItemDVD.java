package Exer1;

public class ItemDVD extends Item {
    private final int duracaoMin;
    public ItemDVD(String nome, double preco, int duracaoMin) {
        super(nome, preco);
        this.duracaoMin = duracaoMin;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return "ItemDVD {" +
                " nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", duracaoMin: " + duracaoMin +
                '}';
    }
}
