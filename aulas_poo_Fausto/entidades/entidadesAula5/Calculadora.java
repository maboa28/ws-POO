package entidadesAula5;

public class Calculadora {

	private int inteiro1; //modificador de acesso private
	public static int inteiro2 = 2; //modificador de acesso private


  private Calculadora(){
    System.out.println("Calculadora pronta para uso...");  
  }

  public Calculadora(int v1){
    System.out.println("Calculadora pronta para uso 2...");  
  }

  public Calculadora(int v1, int v2){
    this();
    System.out.println("Calculadora com 2 inteiros...");  
    inteiro1 = v1;
  //  inteiro2 = v2;
  }

  public Calculadora(int v1, String v2){
    System.out.println("Calculadora pronta para uso com String...");  
  }

	public void setInteiro1(int valor) { //método sem retorno e com parâmetro do int 
		 inteiro1 = valor;
	}

	public void setInteiro2(int valor) { //método sem retorno e com parâmetro do int 
	//	 inteiro2 = valor;
	}

	public int getInteiro1() { //método com retorno e sem parâmetro 
		return inteiro1;
	}
	
	public int getInteiro2() { //método com retorno e sem parâmetro 
		return inteiro2;
	}

	//soma
	public void soma() { //método sem retorno e sem parâmetro 
		System.out.println("Soma: " + (inteiro1 + inteiro2));
	}

	//produto
	public int produto(){ //método com retorno e sem parâmetro 
		return inteiro1*inteiro2;
	}

	//subtracao
	public void subtracao() { //método sem retorno e sem parâmetro 
		System.out.println("Subtração: " + (inteiro1 - inteiro2));
	}

	//quociente
	public int divisao() { //método sem retorno e sem parâmetro 
		int retorno = -1;
    if (inteiro2 != 0) {
      retorno = inteiro1/inteiro2;  
    } 
    return retorno; 
    
	}

  //quadrado
  /*
  Método sem retorno e com parâmetro do tipo inteiro 
  */
	public static void quadrado(int v) { 
		Calculadora.inteiro2 = 1000;
    System.out.println("Quadrado: " + (v * v));
	}

  public static void quadrado(Calculadora c) { 
    c.subtracao();
		System.out.println("Quadrado: " + (c.inteiro2 * c.inteiro2));
	}

  /*
  Quadrado: Método sem retorno e com parâmetro do tipo inteiro 
  */
	public static void quadrado(double v) { 
		System.out.println("Quadrado: " + (v * v));
	}

  public static void quadrado(int v1, int v2) { 
		System.out.println("Quadrado: " + (v1 * v1));
    System.out.println("Quadrado: " + (v2 * v2));
	}
	
}
