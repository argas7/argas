package vendas;

public class VendaJaCadastradaException extends Exception {
	
	public VendaJaCadastradaException() {
		super("O ID passado j� consta em nosso Banco de Dados!");
	}
}
