package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class PrincipalEx01Pedido {

	public static void main(String[] args) {
		
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setValor(29.90);
        p1.setDescricao("Calça");

        ItemPedido ip1 = new ItemPedido();
        ip1.setQuantidade(2);
        ip1.setProduto(p1);

        Pedido ped1 = new Pedido();
        ped1.setNumeroNota(1001);
        ped1.adicionarItem(ip1);
        
        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setValor(9.90);
        p2.setDescricao("Camiseta");

        ItemPedido ip2 = new ItemPedido();
        ip2.setQuantidade(5);
        ip2.setProduto(p2);

        Pedido ped2 = new Pedido();
        ped2.setNumeroNota(1002);
        ped2.adicionarItem(ip2);
        
        System.out.println("Número da Nota: " + ped1.getNumeroNota());
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : ped1.getItemPedido()) {
            System.out.println("Produto: " + item.getProduto().getDescricao() + ", Quantidade: " + item.getQuantidade());
        }
        System.out.println("Valor Total do Pedido: R$" + ped1.getValorTotal());
        System.out.println();
        
        
        System.out.println("Número da Nota: " + ped2.getNumeroNota());
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : ped2.getItemPedido()) {
            System.out.println("Produto: " + item.getProduto().getDescricao() + ", Quantidade: " + item.getQuantidade());
        }
        System.out.println("Valor Total do Pedido: R$" + ped2.getValorTotal());
    }
}