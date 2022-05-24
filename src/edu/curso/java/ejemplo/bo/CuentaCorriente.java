package edu.curso.java.ejemplo.bo;

public class CuentaCorriente extends CuentaBancaria implements Producto {

	private Double limiteExtra = 50000.0;
	
	@Override
	public Double calcularPrecioDeVenta() {
		// TODO Auto-generated method stub
		return 1500.0;
	}
	
	public CuentaCorriente(Long numeroDeCuenta) {
		//setNumeroDeCuenta(numeroDeCuenta);
		super.setNumeroDeCuenta(numeroDeCuenta);

	}
	
	public CuentaCorriente(Long numeroDeCuenta, Double saldo) {
		super(numeroDeCuenta, saldo);
	}

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
