package lojaEsportiva.exceptions;

public class FornecedorJaCadastradoException extends  Exception {
    public FornecedorJaCadastradoException(){
        super ("Este fornecedor ja consta no banco de dados.");
    }
}
