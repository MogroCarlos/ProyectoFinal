package Logica;

import java.util.ArrayList;

public class PruebaComida {

	public static void main(String[] args) {
		// Comida1
		Ingrediente arina = new Ingrediente(500, 30);
		Ingrediente salsa = new Ingrediente( 200, 50);
		Ingrediente aceituna = new Ingrediente( 50, 15);
		ArrayList<Ingrediente> pizza = new ArrayList<>();
		pizza.add(arina);
		pizza.add(salsa);
		pizza.add(aceituna);
		//Creo comida1
		Comida pizzaNapolitana = new Comida(pizza,45,"hornear","horno","media");
		double p=precioComida(pizzaNapolitana);
		pizzaNapolitana.setPrecio(p);
		System.out.println("precio napolitana "+pizzaNapolitana.getPrecio());
		
		
		//Comida2
		Ingrediente rucula = new Ingrediente(100, 30);
		Ingrediente cherry = new Ingrediente( 200, 50);
		Ingrediente aceite = new Ingrediente( 5, 10);
		ArrayList<Ingrediente> ensalada1 = new ArrayList<>();
		pizza.add(rucula);
		pizza.add(cherry);
		pizza.add(aceite);
		//creo comida 2
		Comida ensaladaA = new Comida(ensalada1,15,"mesclar todo","ensalada","baja");
		double pe=precioComida(ensaladaA);
		ensaladaA.setPrecio(pe);
		System.out.println("precio ensalada: "+ensaladaA.getPrecio());

		//crear cliente
		Cliente comensal = new Cliente("Jose Cuervo","calle siempre viva 123");
		
		//creo lista de comidas para el pedido
		ArrayList<Comida> comidaMesa =new ArrayList<>();
		comidaMesa.add((Comida) pizzaNapolitana);
		comidaMesa.add((Comida) ensaladaA);

		//creo el pedido
		Pedido mesa = new Pedido(comensal,comidaMesa);
		double costoPedido = precioPedido(mesa);
		mesa.setPrecioT(costoPedido);

		System.out.println("Precio del pedido es: "+mesa.getPrecioT());
	}
	
	
	//Calculamos precio de una comida
	public static Double precioComida(Comida comida) {
		double precioC = 0 ;
		for (int i=0; i<comida.getIngredientes().size() ;i++ ) {
			precioC = precioC + comida.getIngredientes().get(i).getCostoIngrediente();
		}
		System.out.println("control preciocomida "+precioC);
		//System.out.println();
		//Evaluamos segun el tipo de comida
		if (comida.getTipo().equals("horno")) {
			precioC = precioC + 2000;
			System.out.println("horno");
		}else if(comida.getTipo().equals("gurmet")){
			precioC = precioC + 2500;
			System.out.println("gurmet");
		}else if(comida.getTipo().equals("ensalada")) {
			precioC = precioC + 1000;
			System.out.println("ensalada");
		}else {
			precioC = precioC + 1500;
			System.out.println("postre");
		}
		
		//Evaluamos segun la complejidad
		if (comida.getComplejidad().equals("alta") ) {
			precioC = precioC + 2000;
		}else if(comida.getComplejidad().equals("media")){
			precioC = precioC + 1000;
		}else {
			precioC = precioC + 500;
		}
		return precioC ;
	}
	
	//Calculamos el precio de todo el pedido
	public static Double precioPedido(Pedido mesa) {
		double precioPedido=0;
		for(int j=0;j< mesa.getComidas().size() ;j++) {
			precioPedido = precioPedido+ mesa.getComidas().get(j).getPrecio();
		}
	return precioPedido;
	}

}
