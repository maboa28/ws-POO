package aula4;


import entidadesAula4.Calculadora;

import java.util.Scanner;

public class exercicio1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro inteiro: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo inteiro: ");
		int n2 = sc.nextInt();
		
		Calculadora c = new Calculadora(n1, n2);
		
		c.setInteiro1(10);
		c.setInteiro2(5);
		
		c.soma();
		
		
		/// c.produto();
		System.out.println("Soma: " + c.getInteiro1());
		System.out.println("Produto: " + c.produto());
		
		System.out.println("Diferen�a: "+ c.diferenca());
		System.out.println("Quociente: "+ c.quociente());
        c.quadrado(n1);
        c.quadrado(n2);
        
        System.out.println("Digite o valor: ");
		double v = sc.nextDouble();
		c.quadrado(v);
	}

}

