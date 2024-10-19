package Logica;

public class Cliente {
	private String nombreCliente;
	private String direccion;
	
	
	public Cliente() {
		super();
	}


	public Cliente(String nombreCliente, String direccion) {
		super();
		this.nombreCliente = nombreCliente;
		this.direccion = direccion;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", direccion=" + direccion + "]";
	}
	
	

}
