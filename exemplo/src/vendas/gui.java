package vendas;

import java.util.Scanner;

public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fachada fachada = new Fachada(new CadastroVendas(new RepositorioVendasArray()));
		Fachada fachada = new Fachada(new CadastroVendas(new RepositorioVendasLista()));
		Scanner t = new Scanner(System.in);
		int op;
		do {
			
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Remover");
			System.out.println("4 - Alterar");
			System.out.println("0 - Sair");
			System.out.print("Digite sua opção: ");
			op = t.nextInt();
			t.nextLine();
			switch(op) {
			case 1:
				try {
					String produto, cliente, funcionario, venda;
					System.out.print("Digite o ID do Produto: ");
					produto = t.nextLine();
					System.out.print("Digite o ID do Cliente: ");
					cliente = t.nextLine();
					System.out.print("Digite o ID do Funcionario: ");
					funcionario = t.nextLine();
					System.out.print("Digite o ID da Venda: ");
					venda = t.nextLine();
					fachada.cadastrar(new Venda(produto, cliente, funcionario, venda));
					System.out.println("Cadastro realizado com Sucesso!");
				} catch (VendaJaCadastradaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.print("Digite o ID da venda: ");
					Venda venda = fachada.procurar(t.nextLine());
					System.out.println("\nID Cliente: " + venda.getCliente());
					System.out.println("ID Funcionario: " + venda.getFuncionario());
					System.out.println("ID Produto: " + venda.getProduto() + "\n");
				} catch (VendaNaoEncontradaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.print("Digite o ID da venda que desejas remover: ");
					fachada.remover(t.nextLine());
					System.out.println("Venda removida dos registros!");
				} catch (VendaNaoEncontradaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					String produto, cliente, funcionario, venda;
					System.out.print("Digite o novo ID do Produto: ");
					produto = t.nextLine();
					System.out.print("Digite o novo ID do Cliente: ");
					cliente = t.nextLine();
					System.out.print("Digite o ID novo do Funcionario: ");
					funcionario = t.nextLine();
					System.out.print("Digite o ID da Venda que desejas atualizar: ");
					venda = t.nextLine();
					fachada.atualizar(new Venda(produto, cliente, funcionario, venda));
					System.out.println("Registro de venda atualizado!");
				} catch (VendaNaoEncontradaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while(op != 0);
	}

}