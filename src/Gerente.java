//Herencia
public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
	return clave == "Contraseña";
	}
	
	//Sobre-escritura de método
	public double getBonificacion() {
		//Super permite accesar a los metodos de la clase padre
		return super.getSalario() + this.getSalario()*0.05;
	}
}
