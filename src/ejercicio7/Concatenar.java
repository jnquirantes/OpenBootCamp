package ejercicio7;

public class Concatenar {

	public static void main(String[] args) {
		
		String[] textos = {"Hola", "qué", "tal", "como", "estás?"};
		String temp = "";
		
		for(int i= 0; i<textos.length; i++) {
			temp += textos[i] + " ";
			System.out.println(temp);
		}
		

	}

}
