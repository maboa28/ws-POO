package aula4;

import entidadesAula5.Calculadora;

import java.util.Scanner;
//import java.lang.Math;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Insirar o primeiro inteiro: ");
		
		int n1 = s.nextInt();
		// Calculadora.quadrado(n1);
		// System.out.print("Quadrado de Math: " + Math.pow(n1, 2));

		System.out.print("Insirar o segundo inteiro: ");
		int n2 = s.nextInt();
		// Calculadora.quadrado(n1, n2);

		/*
		 * System.out.print("Insirar o valor do desejado double: "); double d1 =
		 * s.nextDouble(); Calculadora.quadrado(d1);
		 */

		// Calculadora c = new Calculadora(n1); // instancia��o de uma classe
		// Calculadora c2 = new Calculadora(n1);
		Calculadora.quadrado(4);
		System.out.println(Calculadora.inteiro2);
		// System.out.println("Divis�o: " + c.divisao()); //acessando um m�todo e sem

		/*
		 * c.soma(); //acessando um m�todo e sem par�metro e sem retorno int p =
		 * c.produto(); //acessando um m�todo sem par�metro e com retorno de um inteiro
		 * System.out.println("Produto: " + p); c.subtracao(); //acessando um m�todo e
		 * sem par�metro e sem retorno System.out.println("Divis�o: " + c.divisao());
		 * //acessando um m�todo e sem par�metro e sem retorno c.quadrado(n1);
		 * c.quadrado(n2); c.quadrado(n1, n2);
		 */

	}
}
