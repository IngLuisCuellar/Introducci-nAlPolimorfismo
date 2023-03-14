
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setSalario(5000);
		gerente.setClave("Contraseña");
		
		System.out.println(gerente.iniciarSesion("Contraseña"));
		System.out.println(gerente.getBonificacion());
	}
}
