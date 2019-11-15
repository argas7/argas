package lojaEsportiva.dados;

public class Venda {
	private String idProduto;
	private String idCliente;
	private String idFuncionario;
	private String id;
	
	public Venda(String produto, String cliente, String funcionario, String id) {
		this.idProduto = produto;
		this.idCliente = cliente;
		this.idFuncionario = funcionario;
		this.id = id;
	}

	public String getProduto() {
		return this.idProduto;
	}

	public void setProduto(String produto) {
		this.idProduto = produto;
	}

	public String getCliente() {
		return this.idCliente;
	}

	public void setCliente(String cliente) {
		this.idCliente = cliente;
	}

	public String getFuncionario() {
		return this.idFuncionario;
	}

	public void setFuncionario(String funcionario) {
		this.idFuncionario = funcionario;
	}
	
	public String getId() {
		return this.id;
	}

}