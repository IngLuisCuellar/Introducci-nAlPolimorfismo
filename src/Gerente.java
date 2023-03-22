//Herencia
public class Gerente extends FuncionarioAutenticable {
	
	
	//Sobre-escritura de método
	public double getBonificacion() {
		//Super permite accesar a los metodos de la clase padre
		return super.getSalario() + this.getSalario()*0.05;
	}
}
