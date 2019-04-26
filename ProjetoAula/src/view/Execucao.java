package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Vitoria Costa");
		
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Rua Eduardo Dalbono");
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Parque Guarani");
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(8523648);
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("São Paulo");
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("São Paulo");
		System.out.println(pessoa.getEstado());
	}

}
