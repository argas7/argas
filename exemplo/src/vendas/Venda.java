package vendas;

public class Venda {
	private Produto produto;
	private PessoaFisica cliente;
	private Funcionario funcionario;
	private String id;
	
	public Venda(Produto produto, PessoaFisica cliente, Funcionario funcionario, String id) {
		this.produto = produto;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.id = id;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public PessoaFisica getCliente() {
		return this.cliente;
	}

	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getId() {
		return this.id;
	}

}