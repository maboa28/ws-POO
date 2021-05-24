package entidadesAula5;

public class DataDeValidade {
	
	int dia, mes, ano;

	public DataDeValidade(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void DataDeValidade() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
	
	

}
