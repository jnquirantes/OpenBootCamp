package ejercicio9;

public class CocheCRUDImpl implements CocheCRUD{

	@Override
	public void save() {
		System.out.println("Soy el m�todo save()");
		
	}

	@Override
	public void findAll() {
		System.out.println("Soy el m�todo findAll()");
		
	}

	@Override
	public String delete() {
		
		return "Soy el m�todo delete()";
	}

}
