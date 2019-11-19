package lojaEsportiva.exceptions;

public class FornecedorNaoEncontradoException  extends Exception{
    public FornecedorNaoEncontradoException(){
        super("O fornecedor nao e ligado a esta loja,por favor verifique o cnpj e tente novamente.");
    }
}
