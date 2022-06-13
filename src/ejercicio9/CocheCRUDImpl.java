package ejercicio9;

public class CocheCRUDImpl implements CocheCRUD{

	@Override
	public void save() {
		System.out.println("Soy el método save()");
		
	}

	@Override
	public void findAll() {
		System.out.println("Soy el método findAll()");
		
	}

	@Override
	public String delete() {
		
		return "Soy el método delete()";
	}

}
