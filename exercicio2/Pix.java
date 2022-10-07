package br.com.prova.av1.exercicio2;

public class Pix  extends Pagamento{
	
	public boolean coprovanteTransacaoPix;

	public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean coprovanteTransacaoPix) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.coprovanteTransacaoPix = coprovanteTransacaoPix;
	}

	public boolean isCoprovanteTransacaoPix() {
		return coprovanteTransacaoPix;
	}

	public void setCoprovanteTransacaoPix(boolean coprovanteTransacaoPix) {
		this.coprovanteTransacaoPix = coprovanteTransacaoPix;
	}
	
	
	public void CupomFiscal (String CupomFiscal) {
		
		
	}
	

}
