
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setClave("Contraseña");
		
		System.out.println(gerente.iniciarSesion("Contraseña"));
	}
}
