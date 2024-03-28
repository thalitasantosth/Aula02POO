package model;

public class ItemPedido {
	
	private int quantidade;
	private Produto produto;

	public ItemPedido () {
		quantidade = 0;
	}
	
	public int  getQuantidade() {
		return quantidade;
		
	}
	
	public void setQuantidade(int quantidade) {
		
	}
	
	public Produto getProduto() {
		return produto;
	}

	public double setProduto(Produto produto) {
		this.produto = produto;
		 double valor = produto.getValor() * quantidade;
		return valor;
	}
	
}
