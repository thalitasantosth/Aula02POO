package model;

public class Produto {
	
	private int codigo;
	private double valor;
	private String descricao;
	
	public Produto () {
		codigo = 0;
		valor = 0.00;
		descricao = null;
	}
	
	public int  getCodigo() {
		return codigo;
		
	}
	
	public void setCodigo (int codigo) {
		this.codigo = codigo;
		
	}
	
	public double  getValor() {
		return valor;
		
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
	
	public String  getDescricao() {
		return descricao;
		
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}

}
