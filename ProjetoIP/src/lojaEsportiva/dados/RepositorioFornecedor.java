package lojaEsportiva.dados;

import lojaEsportiva.exceptions.FornecedorJaCadastradoException;
import lojaEsportiva.exceptions.FornecedorNaoEncontradoException;

public interface RepositorioFornecedor {
    public void remover (String cnpj) throws FornecedorNaoEncontradoException;
    public void atualizar (Fornecedor fornecedor) throws FornecedorNaoEncontradoException;
    public void inserir (Fornecedor fornecedor) throws FornecedorJaCadastradoException;
    public Fornecedor procurar (String dados) throws FornecedorNaoEncontradoException;
    public boolean existe (String cnpj);


}
