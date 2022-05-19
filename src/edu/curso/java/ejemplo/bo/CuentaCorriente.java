package edu.curso.java.ejemplo.bo;

public class CuentaCorriente extends CuentaBancaria {

	private Double limiteExtra = 50000.0;
	
	@Override
	public void extraer(Double monto) {
		Double saldoActual = super.getSaldo();
		Double nuevoSaldo = saldoActual - monto + limiteExtra;
		if(nuevoSaldo >= 0) {
			super.setSaldo(nuevoSaldo);
		} else {
			System.out.println("No tenes tanta plata en la cuenta: " + super.toString());
		}
	}
}
