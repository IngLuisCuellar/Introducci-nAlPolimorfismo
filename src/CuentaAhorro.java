
public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int agencia) {
		super(agencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
		
	}

}
