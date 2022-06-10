package ejercicio6;

public class Precio {

	public static void main(String[] args) {
		
		double precio = 225;
		System.out.println("El precio con IVA es " + precioIVA(precio) + " euros");

	}
	
	public static double precioIVA (double precio) {
		
		double temp = precio*1.21;
		return temp;
		
	}

}
