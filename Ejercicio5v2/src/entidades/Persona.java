package entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private boolean estado;
	
	public Persona(String nombre, String apellido, String dni, boolean habilitado) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDni(dni);
		this.setEstado(habilitado);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public Persona(){}
	
	@Override
	public boolean equals(Object p){
		return (p instanceof Persona ) &&
				(((Persona)p).getDni().equals(this.getDni()));
	}
	

}
