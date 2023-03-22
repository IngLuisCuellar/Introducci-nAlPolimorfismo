
public class TestTributacion {
	 
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(2);
	    cc.depositar(100000.0);

	    CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();

	    calc.registra(cc);
	    System.out.println(calc.getTotalImpuesto());
	    }

}
