
public class Q3_Fatura {

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;

	public Q3_Fatura(String numero, String descricao, int quantidade, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuant() {
		return quantidade;
	}

	public void setQuant(int qtdComprada) {
		this.quantidade = qtdComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPrecoPorItem(double preco) {
		this.preco = preco;
	}

	public double getTotalFatura() {
		if (this.quantidade * this.preco > 0) {
			return this.quantidade * this.preco;			
		} else {
			return 0.0;
		}
	}

}
