package com.loja;

import java.util.ArrayList;

public class Estoque {
	public Estoque(ArrayList<Item> listaItens, int quantidadeItens, String nomeItem) {
		ListaItens = listaItens;
		this.quantidadeItens = quantidadeItens;
		this.nomeItem = nomeItem;
	}
	private ArrayList<Item> ListaItens;
	private int quantidadeItens;
	private String nomeItem;
	
	public ArrayList<Item> getListaItens() {
		return ListaItens;
	}
	public void setListaItens(ArrayList<Item> listaItens) {
		ListaItens = listaItens;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	
	public String toString() {
		return "Estoque: ListaItens=" + ListaItens + ", quantidadeItens=" + quantidadeItens + ", nomeItem=" + nomeItem
				+ "";
	} 
	
}
