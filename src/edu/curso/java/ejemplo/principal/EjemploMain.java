package edu.curso.java.ejemplo.principal;

import edu.curso.java.ejemplo.bo.*;

public class EjemploMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.setNumeroDeCuenta(987654L);
		cuentaBancaria1.setSaldo(10000.0);
		cuentaBancaria1.extraer(1000.0);

		System.out.println("El saldo final es " 
				+ cuentaBancaria1.getSaldo() );
		
		CuentaBancaria cuentaBancaria2 = new CuentaBancaria(4334L, 5000.0);
	
	
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(424234L, 50000.0);
		cajaDeAhorro1.extraer(90000.0);
		System.out.println(cajaDeAhorro1);
		
		Banco banco1 = new Banco();
		banco1.ejecutarExtraccion(cajaDeAhorro1, 3000.0);
		
	}
	

}
