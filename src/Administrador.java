
//Herenci Múltiple, Java no lo permite
//public class Administrador extends Funcionario, FuncionarioAutenticable {

//Ahora, siendo funcionario se implementa la interfaz autenticable

public class Administrador extends Funcionario implements Autenticable {

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
