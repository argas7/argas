package lojaEsportiva.exceptions;

public class FuncionarioNaoExistenteException extends Exception{

	public FuncionarioNaoExistenteException() {
		super("Funcion�rio nao existe.");
	}
}