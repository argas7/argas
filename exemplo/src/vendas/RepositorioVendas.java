package vendas;


public interface RepositorioVendas {

	public void inserir(Venda venda) throws VendaJaCadastradaException;
	public Venda procurar(String id) throws VendaNaoEncontradaException;
	public void atualizar(Venda venda) throws VendaNaoEncontradaException;
	public void remover(String id) throws VendaNaoEncontradaException;
	public boolean existe(String id);
	
}

