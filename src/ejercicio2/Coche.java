package ejercicio2;

public class Coche {
	
	public static void main(String [] args) {
		
		Coche miCoche = new Coche(4);
		
		miCoche.aumentarPuertas();
		
		System.out.println(miCoche.getPuertas());
	}
	
	int puertas;
	
	public Coche(int puertas) {
		this.puertas = puertas;
	
	}
	
	public int getPuertas() {
		return puertas;
		
	}
	
	public void aumentarPuertas() {
		puertas++;
		
	}

}