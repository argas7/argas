package lojaEsportiva.exceptions;

public class ProdutoNaoEncontradoException extends Exception {

	public ProdutoNaoEncontradoException() {
		super("Erro. O produto nao foi encontrado!!");
	}
}
