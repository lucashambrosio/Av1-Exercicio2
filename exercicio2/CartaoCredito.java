package br.com.prova.av1.exercicio2;

public class CartaoCredito extends Pagamento {
	
	public String numcartao;
	public String bandeiraCartao;
	public String titularcartao;
	public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numcartao,
			String bandeiraCartao, String titularcartao) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.numcartao = numcartao;
		this.bandeiraCartao = bandeiraCartao;
		this.titularcartao = titularcartao;
	}
	public String getNumcartao() {
		return numcartao;
	}
	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public String getTitularcartao() {
		return titularcartao;
	}
	public void setTitularcartao(String titularcartao) {
		this.titularcartao = titularcartao;
	}
	
	public void imprimirCupomFiscal (String imprimirCupomFiscal) {
		
	}

	
}
