package main.java.com.Carrinho;

public class Produto {
    private String descricao;
    private double preco;
    private double precoDolar;
    private double peso; // Kgs

    public Produto(String descr, double preco, double peso, double precDolar) {
        super();
        this.descricao = descr;
        this.preco = preco;
        this.precoDolar = precDolar;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoDolar() {
        return precoDolar;
    }

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", peso=" + peso + ", preço=" + preco + ", precoDolar=" + precoDolar
                + "]";
    }
}