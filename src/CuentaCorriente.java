
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia) { //Fue necesario hacer un contructor aquí
		super(agencia); //Con el parámetro de nuestra clase superior, satisfaciendo las reglas de la clase superior
	}
	
	@Override //Sobrescribe el método
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}
}
