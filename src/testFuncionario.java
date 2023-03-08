
public class testFuncionario {
	public static void main(String[] args) {
		Funcionario luis = new Funcionario();
		
		luis.setNombre("Luis Cuellar");
		luis.setDocumento("4A5A4D8523");
		luis.setSalario(198203);
		
		System.out.println(luis.getNombre() + luis.getDocumento() + luis.getSalario());
	}
}
