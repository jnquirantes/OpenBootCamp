package ejercicio8;

public class SmartPhone extends SmartDevice{
	
	private String modelo;
	private double pantalla;
	private boolean camara;
	
	public SmartPhone() {
		super();
		modelo = null;
		pantalla = 0;
		camara = false;
	}

	public SmartPhone(String tipo, int bateria, boolean wifi, String modelo, double pantalla, boolean camara) {
		super(tipo, bateria, wifi);
		this.modelo = modelo;
		this.pantalla = pantalla;
		this.camara = camara;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPantalla() {
		return pantalla;
	}

	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}

	public boolean getCamara() {
		return camara;
	}

	public void setCamara(boolean camara) {
		this.camara = camara;
	}

	@Override
	public String toString() {
		
		String temp = null;
		if(camara) {
			temp = "tiene camara";
		
		} else {
			temp = "no tiene camara";
		}
		return super.toString() + "\n Además es un SmartPhone modelo " + modelo 
				+ ", con una pantalla " + pantalla 
				+ " pulgadas y " + temp;
	}
	
	
	

}
