package ejercicio3;

public class Persona {
	
	private int edad;
	private String nombre;
	private String telefono;
	
	public static void main(String[] args) {

		Persona p1 = new Persona(0, null, null);
		p1.setEdad(35);
		p1.setNombre("Jessi");
		p1.setTelefono("675456522");
		
		System.out.println("La persona tiene " + p1.getEdad() +
				" años. Se llama " + p1.getNombre() +
				" y su número de telefono es " + p1.getTelefono());

	}
	
	public Persona(int edad, String nombre, String telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
