
public class TestControlBonificacion {
	public static void main(String[] args) {
		
		Funcionario Luis = new Funcionario();
		Luis.setSalario(2000);
		
		Gerente Sam = new Gerente();
		Sam.setSalario(5000);
		
		ControlBonificación controlBonificación = new ControlBonificación();
		
		controlBonificación.registrarSalario(Luis);
		controlBonificación.registrarSalario(Sam);
	}
}
