package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> itemPedido;
	

	public Pedido () {
		numeroNota = 0;
		valorTotal = 0.00;
		itemPedido = new ArrayList<>();
	}
	
	public int  getNumeroNota() {
		return numeroNota;
		
	}
	
	public void setNumeroNota (int numeroNota) {
		this.numeroNota = numeroNota;
		
	}
	
	
	public double getValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itemPedido) {
            valorTotal += item.calcularValorItem();
        }
        return valorTotal;
    }

	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = new ArrayList<>();
	}
	
	public void adicionarItem(ItemPedido item) {
		itemPedido.add(item);
    }
	
		
}
