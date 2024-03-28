package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> itemPedido = new ArrayList<>();
	

	public Pedido () {
		numeroNota = 0;
		valorTotal = 0.00;
	}
	
	public int  getNumeroNota() {
		return numeroNota;
		
	}
	
	public void setNumeroNota (int numeroNota) {
		
	}
	
	
	public double getValorTotal() {
        for (ItemPedido item : itemPedido) {
        	Produto valor = null;
			valorTotal += item.setProduto(valor);
        }
        return valorTotal;
    }

	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	public void adicionarItem(ItemPedido item) {
		itemPedido.add(item);
    }
	
		
}
