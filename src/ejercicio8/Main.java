package ejercicio8;

public class Main {

	public static void main(String[] args) {

		SmartDevice dispositivo = new SmartDevice("Generacion X", 2000, true);
		
		SmartDevice telefono = new SmartPhone("Generacion A", 1500, true, "Pro 5", 15.6, true);
		
		SmartDevice reloj = new SmartWatch("Generacion Z", 3100, false, 700, "Lin v.2", false);
		
		System.out.println(dispositivo + "\n\n" + telefono + "\n\n" + reloj);

	}

}
