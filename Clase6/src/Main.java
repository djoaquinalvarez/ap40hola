import Modelo.Calculadora;


public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.calcularSuma());
		System.out.println(calculadora.calcularResta());
		System.out.println(calculadora.calcularProd());
		System.out.println(calculadora.calcularDiv());
	}

}
