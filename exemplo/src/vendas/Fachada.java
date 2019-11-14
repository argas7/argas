package vendas;

public class Fachada {
	private CadastroVendas vendas;

	public Fachada(CadastroVendas vendas) {
		super();
		this.vendas = vendas;
	}
	
	public void cadastrar(Venda venda) throws VendaJaCadastradaException {
		this.vendas.cadastrar(venda);
	}
	
	public Venda procurar(String id) throws VendaNaoEncontradaException {
		return this.vendas.procurar(id);
	}
	
	public void remover(String id) throws VendaNaoEncontradaException {
		this.vendas.remover(id);
	}
	
	public void atualizar(Venda venda) throws VendaNaoEncontradaException {
		this.vendas.atualizar(venda);
	}

}
