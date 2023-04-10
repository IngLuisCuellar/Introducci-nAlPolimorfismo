
public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(54);
		cuenta.depositar(500);
		cuenta.saca(700);
	}
}
