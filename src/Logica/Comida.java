package Logica;

import java.util.ArrayList;

public class Comida extends Receta {
	private Double precio;

	public Comida() {
		super();
	}
	
	public Comida(ArrayList<Ingrediente> ingredientes, int tiempoCoccion, String modoPreparacion, String tipo,
			String complejidad) {
		super(ingredientes, tiempoCoccion, modoPreparacion, tipo, complejidad);
		// TODO Auto-generated constructor stub
	}



	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comida [precio=" + precio + ", getIngredientes()=" + getIngredientes() + ", getTiempoCoccion()="
				+ getTiempoCoccion() + ", getModoPreparacion()=" + getModoPreparacion() + ", getTipo()=" + getTipo()
				+ ", getComplejidad()=" + getComplejidad() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
