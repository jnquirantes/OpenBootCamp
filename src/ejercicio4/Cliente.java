package ejercicio4;

public class Cliente extends Persona{
	
	private double credito;

	public static void main(String[] args) {
		Cliente c1 = new Cliente(170.25);
		c1.setEdad(35);
		c1.setNombre("Jessi");
		c1.setTelefono("675458966");
		
		System.out.println("El cliente se llama " + c1.getNombre() +
				". Tiene " + c1.getEdad() + " años y su teléfono es " + c1.getTelefono() +
				". Además posee un crédito de " + c1.getCredito() + "€");

	}
	
	public Cliente() {
		super();
		credito = 0;
	}

	public Cliente(double credito) {
		super();
		this.credito = credito;
	}
	
	public double getCredito() {
		return credito;
	}
	
	public void setCredito(double credito) {
		this.credito = credito;
	}
}
