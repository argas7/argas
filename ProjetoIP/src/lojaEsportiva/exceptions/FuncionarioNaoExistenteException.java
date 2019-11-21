package lojaEsportiva.exceptions;

public class FuncionarioNaoExistenteException extends Exception{

	public FuncionarioNaoExistenteException() {
		super("Funcionario nao existe.");
	}
}