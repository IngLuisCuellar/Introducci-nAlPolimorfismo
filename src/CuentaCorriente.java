
public class CuentaCorriente extends Cuenta implements Tributacion {
	public CuentaCorriente(int agencia) { //Fue necesario hacer un contructor aquí
		super(agencia); //Con el parámetro de nuestra clase superior, satisfaciendo las reglas de la clase superior
	}
	
	@Override //Sobrescribe el método
	public void saca(double valor) {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
}
