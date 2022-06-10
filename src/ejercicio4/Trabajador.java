package ejercicio4;

public class Trabajador extends Persona {
	
	private double salario;

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador(35, "Jessi", "694445588", 1650.20);
		
		System.out.println("El trabajador se llama " + t1.getNombre() +
				". Tiene " + t1.getEdad() + " años y su teléfono es " + t1.getTelefono() +
				". Además posee un salario de " + t1.getSalario() + "€");

	}
	
	public Trabajador() {
		super();
		salario = 0;
	}

	public Trabajador(int edad, String nombre, String telefono, double salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
