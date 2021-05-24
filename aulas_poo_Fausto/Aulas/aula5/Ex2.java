package aula5;

import entidadesAula5.CartaoDeCredito;
import entidadesAula5.Cliente;
import entidadesAula5.ContaCorrente;

public class Ex2 {
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Cliente 1");
		
		CartaoDeCredito cc = new CartaoDeCredito(123456, c, 9, 4, 2025);
		cc.imprimir();
		
		CartaoDeCredito cc2 = new CartaoDeCredito(456789, c, 28, 12, 2022);
		cc2.imprimir();
		
		ContaCorrente cor = new ContaCorrente(123, 456, c);
		cor = null;
	}
}
