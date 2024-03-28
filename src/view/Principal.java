package view;

import model.ItemPedido;
import model.Pedido;

public class Principal {

	public static void main(String[] args) {
		Pedido p = new Pedido(); 
		p.setNumeroNota(1);
		p.getValorTotal();
		
		ItemPedido ip = new ItemPedido();
		ip.setQuantidade(3);
		
		System.out.println("Perimetro do Circulo: " + p.getValorTotal());
	}

}
