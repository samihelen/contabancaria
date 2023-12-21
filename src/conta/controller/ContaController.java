package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.IContaRepository;

public class ContaController implements IContaRepository {
	
	private ArrayList<Conta>listadasContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null)
			conta.visualizar();
		else
			System.out.println("\nA conta de número: " + numero + " não foi encontrada.");
		}
		
	@Override
	public void listarTodas() {
		for (var conta : listadasContas) {
			conta.visualizar();//criei um for para percorrer o array list, o metodo esta vazio pois retornara todos os itens da listadasContas
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listadasContas.add(conta);
		System.out.println("\nA conta de número: " + conta.getNumero() + "  foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if(buscaConta != null) {
			listadasContas.set(listadasContas.indexOf(buscaConta), conta);
			System.out.println("\nA conta de número: " + conta.getNumero() + " foi atualizada com sucesso.");
		}else
			System.out.println("\nA conta de número: " + conta.getNumero() + " não foi encontrada.");
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if (listadasContas.remove(conta) == true)
				System.out.println("\nA Conta de número: " + numero + " foi deletada com sucesso!");
		}else
			System.out.println("\nA Conta de número: " + numero + " não foi encontrada!");
						
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("\nO saque na Conta de número: " + numero + " foi efetuado com sucesso!");
		}else
			System.out.println("\nA Conta de número: " + numero + " não foi encontrada.");
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nDepósito na Conta de número: " + numero + " foi efetuado com sucesso.");
		}else
			System.out.println("\nA conta de número: " + numero + " não foi encontrada ou a Conta destino não é uma Conta Corrente");
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferência foi efetuada com sucesso!");
			}
		}else
			System.out.println("\nA conta de origem e/ou destino não foram encontradas!");
	}
	public int gerarNumero() {
		return ++ numero;		
	}
	
	public Conta buscarNaCollection(int numero) {
		for(var conta : listadasContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}
}
