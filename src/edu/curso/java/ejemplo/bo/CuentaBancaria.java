package edu.curso.java.ejemplo.bo;

public abstract class CuentaBancaria {

	private Long numeroDeCuenta;
	private Double saldo;
	
	public CuentaBancaria() {
		System.out.println("Creando cuenta bancaria");
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + "]";
	}

	public CuentaBancaria(Long numeroDeCuenta) {
		System.out.println("Creando cuenta bancaria con parametros");
		this.numeroDeCuenta = numeroDeCuenta;
	}
	
	public CuentaBancaria(Long numeroDeCuenta, Double saldo) {
		System.out.println("Creando cuenta bancaria con parametros");
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}
	
	public abstract void extraer(Double monto);

	public Long getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(Long numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		if(saldo < 0.0) {
			this.saldo = 0.0;
		} else {
			this.saldo = saldo;
		}
	}
	
}
