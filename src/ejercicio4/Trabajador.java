package ejercicio4;

public class Trabajador extends Persona {
	
	private double salario;

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador();
		t1.setSalario(1650.20);
		
		System.out.println("El trabajador se llama " + t1.getNombre() +
				". Tiene " + t1.getEdad() + " años y su teléfono es " + t1.getTelefono() +
				". Además posee un salario de " + t1.getSalario() + "€");

	}
	
	public Trabajador() {
		super(35, "Jessi", "675145965");
		salario = 0;
	}

	public Trabajador(double salario) {
		super();
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double credito) {
		this.salario = credito;
	}

}
