//Clase abstracta sin representación física
public abstract class Funcionario {
	
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
	
	//Dejamos el método para ser usado por las clases hijas
	//Siempre debe ser implementado
	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
