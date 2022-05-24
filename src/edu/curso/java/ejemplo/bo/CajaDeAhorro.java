package edu.curso.java.ejemplo.bo;

public class CajaDeAhorro extends CuentaBancaria implements Producto {

	public CajaDeAhorro() {
		
	}
	
	public CajaDeAhorro(Long numeroDeCuenta, Double saldo) {
		super(numeroDeCuenta, saldo);
	}
	
	@Override
	public void extraer(Double monto) {
		Double saldoActual = super.getSaldo();
		Double nuevoSaldo = saldoActual - monto;
		if(nuevoSaldo >= 0) {
			super.setSaldo(nuevoSaldo);
		} else {
			System.out.println("No tenes tanta plata en la cuenta: " + super.toString());
		}
	}

	@Override
	public Double calcularPrecioDeVenta() {
		// TODO Auto-generated method stub
		return 800.0;
	}

}
