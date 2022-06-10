package ejercicio2;

import java.util.Scanner;

public class Estructuras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nÚmero");
		var numeroIf = sc.nextInt();
		
		if(numeroIf < 0 ) {
			System.out.println("El nÚmero es negativo");
			
		} else if (numeroIf > 0) {
			System.out.println("El nÚmero es positivo");
			
		} else {
			System.out.println("El nÚmero es 0");
			
		}
		
		var numeroWhile = 0;
		
		while(numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
			
		}
		
		numeroWhile = 0;
		
		do {
			numeroWhile = 3;
			System.out.println(numeroWhile);
		
		} while(numeroWhile < 3);
		
		int numeroFor;
		
		for(numeroFor = 0; numeroFor<=3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		System.out.println("Introduce un nÚmero");
		int estacion = sc.nextInt();
		
		switch(estacion) {
		
			case 1:
				System.out.println("Es invierno");
			break;
			
			case 2:
				System.out.println("Es primavera");
			break;
			
			case 3:
				System.out.println("Es verano");
			break;
			
			case 4:
				System.out.println("Es otoño");
			break;
			
			default:
				System.out.println("El nÚmero no corresponde con ninguna estación");
			break;
		}
	}

}
