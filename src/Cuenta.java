/*Entidad Cuenta: Class para representar entidades
 * Saldo
 * Agencia
 * Numero
 * Titular 
 */

public abstract class Cuenta {
	
	protected double saldo; //Permite que sea usado solo por las clases hijas
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente(); //Se referencia con el objeto tipo Cliente
	
	private static int total = 0; //Static hace que la variable sea de la clase, mas no de la instancia
	//Este constructor hace que se deba dar el atributo agencia al hacer una new Cuenta
	
	
	public static int getTotal() {
		return total;
	}

	public Cuenta(int agencia) {
		if(agencia < 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++; //Permite llevar el conteo del numero de cuentas que se han creado
		System.out.println("Se han creado " + total + " cuentas en total");
	}
	
	//Void --> No retorna valor
	public abstract void depositar(double saldo);
	
	
	// Retorna true or false
	public boolean retirar(double saldo){ //Boolean porque retorna si es un exito o un error
		if(this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		}
		return false;
	}
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SinSaldoException("No tienes saldo suficiente");
		}
		this.saldo -= valor;
	}
	
								//Objeto tipo cuenta
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saca(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

}
