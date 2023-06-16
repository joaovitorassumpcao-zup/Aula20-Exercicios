package Exer1;

public class ItemCD extends Item {
    private final int numeroFaixas;

    public ItemCD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String mostrarDetalhesDoItem() {
        return "ItemCD {" +
                " nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", numeroFaixas: " + numeroFaixas +
                '}';
    }
}