package entidadesAula5;

public class CartaoDeCredito {
	
	private int numero;
	private Cliente cliente;
	private DataDeValidade data;
	
	public CartaoDeCredito(int numero, Cliente cliente, int dia, int mes, int ano) {
		this.numero = numero;
		this.cliente = cliente;
		this.data = new DataDeValidade(dia, mes, ano);
	}
	 public void imprimir() {
		 System.out.println("Numero: "+ this.numero);
		 System.out.println("Cliente: " + this.cliente.getNome());
		 this.data.DataDeValidade();
	 }
/*
 * public void apagarCliente() {
 *    this.cliente = null;
 * }
 */
	
}
