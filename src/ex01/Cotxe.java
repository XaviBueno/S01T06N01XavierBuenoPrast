package ex01;


public class Cotxe {
	private String marca;
	private String model;
	private int potencia;

	public Cotxe(String marca,String model,int potencia) {
		this.marca=marca;
		this.model=model;
		this.potencia=potencia;
	}
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public int getPotencia() {
		return potencia;
	}
	
	@Override
	
	public String toString() {
		return "Marca:"+marca + "   Model:"+model+ "  Potencia:"+potencia;
	}
}


