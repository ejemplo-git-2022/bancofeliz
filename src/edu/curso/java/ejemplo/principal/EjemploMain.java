package edu.curso.java.ejemplo.principal;

import edu.curso.java.ejemplo.bo.*;

public class EjemploMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente cuentaCorriente1 = new CuentaCorriente(12331L, 250000.0);
		System.out.println(cuentaCorriente1);
		
		CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(424234L, 50000.0);
		System.out.println(cajaDeAhorro1);
		
		Seguro seguro1 = new Seguro();
		
		Banco banco1 = new Banco();
		banco1.ejecutarExtraccion(cajaDeAhorro1, 3000.0);
		banco1.ejecutarExtraccion(cuentaCorriente1, 5000.0);
		
		banco1.venderProducto(cuentaCorriente1);
		banco1.venderProducto(seguro1);
		banco1.venderProducto(cajaDeAhorro1);
		
		
	}
	

}
