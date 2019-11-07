package vendas;

public class RepositorioVendasArray implements RepositorioVendas {
	private Venda[] vendas;
	private int index = 0; 

    public RepositorioVendasArray() {
		this.vendas = new Venda[100];
	}
	
	@Override
	public void cadastrar(Venda venda) throws VendaJaCadastradaException {
		for(int i = 0; i < this.index; i++) {
			if(this.vendas[i].getId().equals(venda.getId())) {
				throw new VendaJaCadastradaException();
			}
		}
		this.vendas[this.index] = venda;
		this.index++;
	}

	@Override
	public Venda procurar(String id) throws VendaNaoEncontradaException {
		Venda venda = null;
		boolean isCadastrado = false;
		for(int i = 0; i < this.index && !isCadastrado; i++) {
			if(this.vendas[i].getId().equals(id)) {
				venda = this.vendas[i];
				isCadastrado = true;
			}
		}
		if(isCadastrado) {
			return venda;
		} else {
			throw new VendaNaoEncontradaException();
		}
	}

	@Override
	public void atualizar(Venda registroVenda) throws VendaNaoEncontradaException {
		int iVenda = this.getIndex(registroVenda.getId());
		this.vendas[iVenda] = registroVenda;
	}

	@Override
	public void remover(String id) throws VendaNaoEncontradaException {
		int iVenda = this.getIndex(id);
		for(int i = iVenda; i < this.index - 1; i++) {
			this.vendas[i] = this.vendas[i + 1];
		}
		this.index--;
	}
	
	public int getIndex(String id) throws VendaNaoEncontradaException {
		int iVenda = -1;
		boolean isCadastrado = false;
		for(int i = 0; i < this.index && !isCadastrado; i++) {
			if(this.vendas[i].getId().equals(id)) {
				iVenda = i;
				isCadastrado = true;
			}
		}
		if(isCadastrado) {
			return iVenda;
		} else {
			throw new VendaNaoEncontradaException();
		}
	}
}
