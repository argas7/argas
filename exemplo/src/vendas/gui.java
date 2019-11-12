package vendas;

import javax.swing.JOptionPane;

public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepositorioVendas repArray = new RepositorioVendasArray();
		try {
			repArray.inserir(new Venda(new Produto(), new Cliente(), new Funcionario(), "1234"));
		} catch (VendaJaCadastradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.inserir(new Venda(new Produto(), new Cliente(), new Funcionario(), "1234"));
		} catch (VendaJaCadastradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.inserir(new Venda(new Produto(), new Cliente(), new Funcionario(), "12345"));
		} catch (VendaJaCadastradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.inserir(new Venda(new Produto(), new Cliente(), new Funcionario(), "123456"));
		} catch (VendaJaCadastradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			Venda venda = repArray.procurar("1234");
			System.out.println(venda.getId());
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			Venda venda = repArray.procurar("123");
			System.out.println(venda.getId());
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.atualizar(new Venda(new Produto(), new Cliente(), new Funcionario(), "123"));
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.atualizar(new Venda(new Produto(), new Cliente(), new Funcionario(), "1234"));
			System.out.println("Venda Atualizada");
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.remover("12345");
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.remover("12345");
		} catch (VendaNaoEncontradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			repArray.inserir(new Venda(new Produto(), new Cliente(), new Funcionario(), "124"));
		} catch (VendaJaCadastradaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		System.out.println("FIM");
	}

}