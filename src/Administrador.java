
//Herenci Múltiple, Java no lo permite
//public class Administrador extends Funcionario, FuncionarioAutenticable {

//Ahora, siendo funcionario se implementa la interfaz autenticable

public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;
	
	//Composición de objetos
	public Administrador() { //Inicializa siempre por defecto
		this.util = new AutenticacionUtil();
	}	
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
}
