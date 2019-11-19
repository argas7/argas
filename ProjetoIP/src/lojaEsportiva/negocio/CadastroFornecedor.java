package lojaEsportiva.negocio;

import lojaEsportiva.dados.Fornecedor;
import lojaEsportiva.dados.RepositorioFornecedor;
import lojaEsportiva.exceptions.FornecedorJaCadastradoException;
import lojaEsportiva.exceptions.FornecedorNaoEncontradoException;

public class CadastroFornecedor{
   private RepositorioFornecedor fornecedor;
   public CadastroFornecedor (RepositorioFornecedor rep) {
	   fornecedor = rep;
   }
   public void cadastrar (Fornecedor fornecedor) throws FornecedorJaCadastradoException{
	  this.fornecedor.inserir(fornecedor);
   }
   public void remover (String cnpj) throws FornecedorNaoEncontradoException{
	   this.fornecedor.remover(cnpj);
   }
   public Fornecedor procurar (String cnpj) throws FornecedorNaoEncontradoException{
	   return this.fornecedor.procurar(cnpj);
   }
   public void atualizar (Fornecedor fornecedor) throws FornecedorNaoEncontradoException{
	   this.fornecedor.atualizar(fornecedor);
   }
}
