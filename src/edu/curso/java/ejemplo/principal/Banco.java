package edu.curso.java.ejemplo.principal;

import edu.curso.java.ejemplo.bo.CuentaBancaria;
import edu.curso.java.ejemplo.bo.Producto;

public class Banco {

	public void ejecutarExtraccion(CuentaBancaria cuentaBancaria, Double monto) {
		System.out.println("*************************************************");
		System.out.println("Ejecutnado extraer de: " + cuentaBancaria);
		System.out.println("Tipo de cuenta: " + cuentaBancaria.getClass().getName());		
		cuentaBancaria.extraer(monto);
	}

	public void venderProducto(Producto producto) {
		System.out.println("Tipo de producto: " + producto.getClass().getName());		
		System.out.println(producto.calcularPrecioDeVenta());
	}
	
}

