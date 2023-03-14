
public class testFuncionario {
	public static void main(String[] args) {
		Funcionario luis = new Funcionario();
		
		luis.setNombre("Luis Cuellar");
		luis.setDocumento("4A5A4D8523");
		luis.setSalario(1000);
		luis.setTipo(0);
		
		System.out.println(luis.getNombre());
		
		System.out.println(luis.getBonificacion());
		System.out.println(luis.getSalario());
		
	}
}
