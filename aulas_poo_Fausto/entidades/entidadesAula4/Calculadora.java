package entidadesAula4;

public class Calculadora {
	
	private int inteiro1;
	private int inteiro2;
	
	public Calculadora() {
		System.out.println("Calculadora pronta para o uso...");
	}
	
	public Calculadora(int inteiro1, int inteiro2) {
		this.inteiro1 = inteiro1;
		this.inteiro2 = inteiro2;
	}
	
	
	public int getInteiro1() {
		return inteiro1;
	}


	public void setInteiro1(int inteiro1) {
		this.inteiro1 = inteiro1;
	}


	public int getInteiro2() {
		return inteiro2;
	}


	public void setInteiro2(int inteiro2) {
		this.inteiro2 = inteiro2;
	}


	public int soma() { 
		return inteiro1 + inteiro2;
	}
	
	public int produto() {
		return inteiro1*inteiro2;
	}
	
	public int diferenca() {
		return inteiro1 - inteiro2;
	}
	
	public int quociente() {
		return inteiro1 / inteiro2;
	}
	
	public void quadrado(double v) {
		System.out.println("Quadrado: " + (v * v));
	}
}