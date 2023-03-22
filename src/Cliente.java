// Referencia, este va ser el titular

//Las interfaces no se extendienden, se implementan
public class Cliente implements Autenticable {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
		
	//Composición de objetos
	public Cliente() { //Inicializa siempre por defecto
		this.util = new AutenticacionUtil();
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	
	
}
