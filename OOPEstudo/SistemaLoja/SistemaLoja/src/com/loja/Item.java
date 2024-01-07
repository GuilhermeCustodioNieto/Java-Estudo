package com.loja;

public class Item {
	public Item(String nomeProduto, double preco, String tipoItem) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.tipoItem = tipoItem;
	}
	
	private String nomeProduto;
	private double preco;
	private String tipoItem;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}
	
	public String toString() {
		return "Item: nomeProduto=" + nomeProduto + ", preco=" + preco + ", tipoItem=" + tipoItem + "";
	}
	
	
}
