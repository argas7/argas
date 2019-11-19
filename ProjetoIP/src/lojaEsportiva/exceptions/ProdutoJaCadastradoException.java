package lojaEsportiva.exceptions;

public class ProdutoJaCadastradoException extends Exception {
 
	public ProdutoJaCadastradoException() {
	  super("Erro. O produto ja foi cadastrado!!!");
 }
}
