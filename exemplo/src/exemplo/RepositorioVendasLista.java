package exemplo;

public class RepositorioVendasLista implements RepositorioVendas {
	private Venda venda;
	private RepositorioVendasLista proximo;
	
	public RepositorioVendasLista() {
		this.venda = null;
		this.proximo = null;
	}
	
	@Override
	public void registrar(PessoaFisica pessoaFisica, Funcionario funcionario, Produto produto) {
		
	}

	@Override
	public Venda procurar(String id) {
		return null;
	}

	@Override
	public void atualizarRegistro(Venda registroVenda) {
		
	}

	@Override
	public void apagarRegistro(String id) {
		
	}

}
