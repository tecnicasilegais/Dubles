package main.java.com.Carrinho;

public interface Frete {
    public double custoFrete(double peso, int qtdade);
    /*
     * { return qtdade > 20 ? 0.0 : qtdade * peso * 5.0; }
     */
}