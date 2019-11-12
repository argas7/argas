package vendas;

public class CadastroVendas {
	private RepositorioVendas vendas;

	public CadastroVendas(RepositorioVendas vendas) {
		this.vendas = vendas;
	}
	
	public void cadastrar(Venda venda) throws VendaJaCadastradaException {
		if(!vendas.existe(venda.getId())) {
			vendas.inserir(venda);
		} else {
			throw new VendaJaCadastradaException();
		}
	}
}