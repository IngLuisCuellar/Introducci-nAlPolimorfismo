//Interface no permite métodos implementados, ni puede extender de una clase
public interface Autenticable{
	
	//No se permiten accesos privados, ya que no hay cuerpos
	//private String clave;
	
	//Toda interface es abstracta y sus métodos
	
	public void setClave(String clave) ;
	
	public boolean iniciarSesion(String clave);
	
}
