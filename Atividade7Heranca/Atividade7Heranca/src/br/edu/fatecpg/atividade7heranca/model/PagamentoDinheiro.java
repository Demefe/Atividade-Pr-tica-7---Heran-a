package br.edu.fatecpg.atividade7heranca.model;

public class PagamentoDinheiro implements pagamento{

	private double valor;
	private double Total;
	
	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}
	@Override
	public double calcularPagamento() {
		Total = this.valor -(this.valor * (10.0/100));
		return Total;

	}

	@Override
	public String emitirRecibo() {
		return "\nPagamento em Dinheiro\n"+"Valor Pagamento: "+this.valor+ "\nDesconto: 10%\n"+"Total: "+ Total;
	}

}
