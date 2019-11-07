package vendas;


public interface RepositorioVendas {

	public void cadastrar(Venda venda) throws VendaJaCadastradaException;
	public Venda procurar(String id) throws VendaNaoEncontradaException;
	public void atualizar(Venda registroVenda) throws VendaNaoEncontradaException;
	public void remover(String id) throws VendaNaoEncontradaException;
	
}