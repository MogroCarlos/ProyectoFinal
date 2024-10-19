package Logica;

import java.util.ArrayList;

public class Pedido {
	private Cliente comensal;
	private ArrayList<Comida> comidas;
	private Double precioT;
	public Pedido() {
		super();
	}
	public Pedido(Cliente comensal, ArrayList<Comida> comidas) {
		super();
		comidas = new ArrayList<>();
		this.comensal = comensal;
		this.comidas = comidas;
		//this.precioT = precioT;
	}
	public Cliente getComensal() {
		return comensal;
	}
	public void setComensal(Cliente comensal) {
		this.comensal = comensal;
	}
	public ArrayList<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(ArrayList<Comida> comidas) {
		this.comidas = comidas;
	}
	public Double getPrecioT() {
		return precioT;
	}
	public void setPrecioT(Double precioT) {
		this.precioT = precioT;
	}
	@Override
	public String toString() {
		return "Pedido [comensal=" + comensal + ", precioT=" + precioT + "]";
	}
	

}
