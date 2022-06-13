package ejercicio9;

public class Main {
	
	public static void main(String[] args) {
		
		CocheCRUD c1 = new CocheCRUDImpl();
		
		c1.save();
		c1.findAll();
		System.out.println(c1.delete());
	}
}