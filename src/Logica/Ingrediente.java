package Logica;

public class Ingrediente {
	private double gramos;
	private double costoIngrediente;
	
	public Ingrediente() {
		super();
	}
	
	public Ingrediente(double gramos, double costoIngrediente) {
		super();
		this.gramos = gramos;
		this.costoIngrediente = costoIngrediente;
	}
	
	public double getGramos() {
		return gramos;
	}
	
	public void setGramos(double gramos) {
		this.gramos = gramos;
	}
	
	public double getCostoIngrediente() {
		return costoIngrediente;
	}
	
	public void setCostoIngrediente(double costoIngrediente) {
		this.costoIngrediente = costoIngrediente;
	}
	
	@Override
	public String toString() {
		return "Ingrediente [gramos=" + gramos + ", costoIngrediente=" + costoIngrediente + "]";
	}
	
	

}
