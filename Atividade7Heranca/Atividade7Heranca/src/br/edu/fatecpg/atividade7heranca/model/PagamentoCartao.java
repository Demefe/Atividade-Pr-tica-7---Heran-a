package br.edu.fatecpg.atividade7heranca.model;

public class PagamentoCartao implements pagamento{
	private double valor;
	private double Total;
	
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	@Override
	public double calcularPagamento() {
		this.Total = this.valor +(this.valor * 5.0/100);
		return Total;
		 
	}
	@Override
	public String emitirRecibo() {
		return "Pagamento com Cartão\n"+"Valor Pagamento: "+this.valor+ "\nTaxa: 5%\n"+"Total: "+ Total;
	}
	

}
