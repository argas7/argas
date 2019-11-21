package lojaEsportiva.exceptions;

public class FuncionarioJaCadastradoException extends Exception {

	public FuncionarioJaCadastradoException() {
		super("Funcionario ja esta cadastrado.");
	}

}