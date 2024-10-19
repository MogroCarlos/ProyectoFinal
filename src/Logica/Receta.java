package Logica;

import java.util.ArrayList;

public class Receta {
	private ArrayList<Ingrediente> ingredientes;
	private int tiempoCoccion;
	private String modoPreparacion;
	private String tipo;
	private String complejidad;
	
	public Receta() {
		super();
	}
	public Receta(ArrayList<Ingrediente> ingredientes, int tiempoCoccion, String modoPreparacion, String tipo,
			String complejidad) {
		super();
		this.ingredientes = ingredientes;
		this.tiempoCoccion = tiempoCoccion;
		this.modoPreparacion = modoPreparacion;
		this.tipo = tipo;
		this.complejidad = complejidad;
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getTiempoCoccion() {
		return tiempoCoccion;
	}
	public void setTiempoCoccion(int tiempoCoccion) {
		this.tiempoCoccion = tiempoCoccion;
	}
	public String getModoPreparacion() {
		return modoPreparacion;
	}
	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(String complejidad) {
		this.complejidad = complejidad;
	}
	@Override
	public String toString() {
		return "Receta [ingredientes=" + ingredientes + ", tiempoCoccion=" + tiempoCoccion + ", modoPreparacion="
				+ modoPreparacion + ", tipo=" + tipo + ", complejidad=" + complejidad + "]";
	}
	
	
	
	
}
