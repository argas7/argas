package exemplo;

public interface RepositorioVendas {

	public void registrar(PessoaFisica pessoaFisica, Funcionario funcionario, Produto produto);
	public Venda procurar(String id);
	public void atualizarRegistro(Venda registroVenda);
	public void apagarRegistro(String id);
	
}