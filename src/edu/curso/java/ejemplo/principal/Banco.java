package edu.curso.java.ejemplo.principal;

import edu.curso.java.ejemplo.bo.CuentaBancaria;

public class Banco {

	public void ejecutarExtraccion(CuentaBancaria cuentaBancaria, Double monto) {
		System.out.println("*************************************************");
		System.out.println("Ejecutnado extraer de: " + cuentaBancaria);
		System.out.println("Tipo de cuenta: " + cuentaBancaria.getClass().getName());		
		cuentaBancaria.extraer(monto);
	}
	
}
