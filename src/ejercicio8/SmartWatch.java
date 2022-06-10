package ejercicio8;

public class SmartWatch extends SmartDevice{
	
	private int resolucion;
	private String modelo;
	private boolean acuatico;
	
	public SmartWatch() {
		super();
		resolucion = 0;
		modelo = null;
		acuatico = false;
		
	}

	public SmartWatch(String tipo, int bateria, boolean wifi, int resolucion, String modelo, boolean acuatico) {
		super(tipo, bateria, wifi);
		this.resolucion = resolucion;
		this.modelo = modelo;
		this.acuatico = acuatico;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean getAcuatico() {
		return acuatico;
	}

	public void setAcuatico(boolean acuatico) {
		this.acuatico = acuatico;
	}

	@Override
	public String toString() {
		
		String temp = null;
		if(acuatico) {
			temp = "es acuatico";
		
		} else {
			temp = "no es acuatico";
		}
		return super.toString() + "\n Además es un SmartWatch con una resolucion de " + resolucion 
				+ " pixeles, cuyo modelo es " + modelo 
				+ " y " + temp;
	}
	
	

}
