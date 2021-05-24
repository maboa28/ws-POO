package entidadesAula4;

public class CalculadoraEx2 {

	private int inteiro1; //modificador de acesso private
	public static int inteiro2 = 2; //modificador de acesso private


  private CalculadoraEx2(){
    System.out.println("Calculadora pronta para uso...");  
  }

  public CalculadoraEx2(int v1){
    System.out.println("Calculadora pronta para uso 2...");  
  }

  public CalculadoraEx2(int v1, int v2){
    this();
    System.out.println("Calculadora com 2 inteiros...");  
    inteiro1 = v1;
  //  inteiro2 = v2;
  }

  public CalculadoraEx2(int v1, String v2){
    System.out.println("Calculadora pronta para uso com String...");  
  }

	public void setInteiro1(int valor) { //m�todo sem retorno e com par�metro do int 
		 inteiro1 = valor;
	}

	public void setInteiro2(int valor) { //m�todo sem retorno e com par�metro do int 
	//	 inteiro2 = valor;
	}

	public int getInteiro1() { //m�todo com retorno e sem par�metro 
		return inteiro1;
	}
	
	public int getInteiro2() { //m�todo com retorno e sem par�metro 
		return inteiro2;
	}

	//soma
	public void soma() { //m�todo sem retorno e sem par�metro 
		System.out.println("Soma: " + (inteiro1 + inteiro2));
	}

	//produto
	public int produto(){ //m�todo com retorno e sem par�metro 
		return inteiro1*inteiro2;
	}

	//subtracao
	public void subtracao() { //m�todo sem retorno e sem par�metro 
		System.out.println("Subtra��o: " + (inteiro1 - inteiro2));
	}

	//quociente
	public int divisao() { //m�todo sem retorno e sem par�metro 
		int retorno = -1;
    if (inteiro2 != 0) {
      retorno = inteiro1/inteiro2;  
    } 
    return retorno; 
    
	}

  //quadrado
  /*
  M�todo sem retorno e com par�metro do tipo inteiro 
  */
	public static void quadrado(int v) { 
		CalculadoraEx2.inteiro2 = 1000;
    System.out.println("Quadrado: " + (v * v));
	}

  public static void quadrado(CalculadoraEx2 c) { 
    c.subtracao();
		System.out.println("Quadrado: " + (c.inteiro2 * c.inteiro2));
	}

  /*
  Quadrado: M�todo sem retorno e com par�metro do tipo inteiro 
  */
	public static void quadrado(double v) { 
		System.out.println("Quadrado: " + (v * v));
	}

  public static void quadrado(int v1, int v2) { 
		System.out.println("Quadrado: " + (v1 * v1));
    System.out.println("Quadrado: " + (v2 * v2));
	}
	
}

