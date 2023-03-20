// Introducción a Polimorfismo
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Luis");
		funcionario.setSalario(2000);
		
		//El elemento más general se puede adaptar al elemento más específico
		Funcionario gerente = new Gerente();
		gerente.setNombre("Sam");
		gerente.setSalario(5000);
		
		//No compila, pues iniciar sesion, no es una referencia de Funcionario
		//gerente.iniciarSesion();
		
	}
}
