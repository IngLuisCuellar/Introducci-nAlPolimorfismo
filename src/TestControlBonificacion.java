
public class TestControlBonificacion {
	public static void main(String[] args) {
		
		Funcionario Luis = new Contador();
		Luis.setSalario(2000);
		
		Gerente Sam = new Gerente();
		Sam.setSalario(5000);
		
		Contador contador = new Contador();
		contador.setSalario(3000);
		
		ControlBonificación controlBonificación = new ControlBonificación();
		
		controlBonificación.registrarSalario(Luis);
		controlBonificación.registrarSalario(Sam);
		controlBonificación.registrarSalario(contador);
		
		
	}
}
