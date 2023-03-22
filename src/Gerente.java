//Herencia
public class Gerente extends Funcionario implements Autenticable {
	
	
	//Sobre-escritura de método
	public double getBonificacion() {
		//Super permite accesar a los metodos de la clase padre
		return super.getSalario() + this.getSalario()*0.05;
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
