package ejercicio8;

public class SmartDevice {
	
	private String tipo;
	private int bateria;
	private boolean wifi;
	
	public SmartDevice() {
		tipo = null;
		bateria = 0;
		wifi = false;
	}
	
	public SmartDevice(String tipo, int bateria, boolean wifi) {
		this.tipo = tipo;
		this.bateria = bateria;
		this.wifi = wifi;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean getWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	@Override
	public String toString() {
		
		String temp = null;
		if(wifi) {
			temp = "tiene wifi";
		
		} else {
			temp = "no tiene wifi";
		}
		
		return "Este SmartDevice es de tipo " + tipo 
				+ ", con una bateria de " + bateria + " horas de duracion, y " + temp;
	}
	
	

}
