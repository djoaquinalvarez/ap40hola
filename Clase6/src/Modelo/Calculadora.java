package Modelo;

public class Calculadora {

	
	
	private double unNum;
	private double otroNum;
	
	public Calculadora() {
		
	}
	public Calculadora(double unNum, double otroNum) {
		this.unNum = unNum;
		this.otroNum = otroNum;
	}
	
	
	
	
	public double calcularSuma() {
		double resultado=0;
		resultado = unNum + otroNum;
		return resultado;
	}
	public double calcularResta() {
		double resultado=0;
		resultado = unNum - otroNum;
		return resultado;
	}
	public double calcularProd() {
		double resultado=0;
		resultado = unNum * otroNum;
		return resultado;
	}
	public double calcularDiv() {
		double resultado=0;
		resultado = unNum / otroNum;
		return resultado;
	}
	
	
	
	
	
	
	
	public double getUnNum() {
		return unNum;
	}
	public void setUnNum(double unNum) {
		this.unNum = unNum;
	}
	public double getOtroNum() {
		return otroNum;
	}
	public void setOtroNum(double otroNum) {
		this.otroNum = otroNum;
	}
}
