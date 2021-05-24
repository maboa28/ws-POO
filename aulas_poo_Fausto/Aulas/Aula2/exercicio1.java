package Aula2;


import entidadesAula2.Calculadora;

public class exercicio1 {


	public static void main(String[] args) {
	
		
		Calculadora c = new Calculadora();
		
		
		c.setInteiro1(10);
		c.setInteiro2(5);
		
		c.soma();
		
		
		/// c.produto();
		System.out.println("Soma: " + c.getInteiro1());
		System.out.println("Produto: " + c.produto());
		
		System.out.println("Diferen�a: "+ c.diferenca());
		System.out.println("Quociente: "+ c.quociente());
        
	}

}



