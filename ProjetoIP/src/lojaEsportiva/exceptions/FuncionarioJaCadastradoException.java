package lojaEsportiva.exceptions;

public class FuncionarioJaCadastradoException extends Exception {

	public FuncionarioJaCadastradoException() {
		super("Funcionário ja esta cadastrado.");
	}

}