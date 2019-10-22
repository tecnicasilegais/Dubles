package main.java.com.Carrinho;

import java.util.LinkedList;

public class CarrinhoCompras {
    private LinkedList<ItemCarrinho> listaProdutos;
    private Cotacao cotacao;
    private Frete frete;
    private Moeda moeda;
    private int qtdItens;

    private class ItemCarrinho {
        private Produto prod;
        private int qtd;

        private ItemCarrinho(Produto prod, int qtd) {
            this.prod = prod;
            this.qtd = qtd;
        }
    }

    public CarrinhoCompras(Cotacao cotacao, Frete frete) {
        this.cotacao = cotacao;
        this.frete = frete;
        this.moeda = null;
        listaProdutos = new LinkedList<ItemCarrinho>();
        qtdItens = 0;
    }

    public void addItem(Produto produto, int quantidade) {
        listaProdutos.add(new ItemCarrinho(produto, quantidade));
        qtdItens += quantidade;
    }

    public void defineMoeda(Moeda moeda) {
        moeda = this.moeda;
    }

    public double calculaCusto() {
        double precoProdutos = 0;
        double precoFrete = 0;
        for (ItemCarrinho item : listaProdutos) {
            produtos += item.prod.getPreco() * item.prod.getPeso() * item.qtd;
        }
        precoFrete = frete.custoFrete(1, qtdItens);
        double precoTotal = precoFrete + precoProdutos;
        return moeda == null ? precoTotal : cotacao.getCotacao(moeda) * precoTotal;
    }
}
