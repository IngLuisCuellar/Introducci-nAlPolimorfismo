
public class Funcionario {
	
	private String nombre;
	private String documento;
	private double salario;
	
	private int tipo;
	
	//constructor es un método del mismo tipo de retorno de la clase
	public Funcionario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacion() {
		return this.salario *0.1;
	
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
