import java.util.List;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(){
		this.contas = new ArrayList<>();
	}

	public void criarConta(Cliente cliente){
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		contas.add(cc);
		contas.add(poupanca);
		cliente.setContaCorrente(cc);
		cliente.setContaPoupanca(poupanca);
	}

	public void transferir(Cliente cliente1, int numConta1, Cliente cliente2, int numConta2, double valor){
		cliente1.getConta(numConta1).transferir(valor, cliente2.getConta(numConta2));
	}

	public void sacar(Cliente cliente, int numConta, double valor){
		cliente.getConta(numConta).sacar(valor);
	}

	public void depositar(Cliente cliente, int numConta, double valor){
		cliente.getConta(numConta).depositar(valor);
	}

	public void imprimirExtrato(Cliente cliente, int numConta){
		cliente.getConta(numConta).imprimirExtrato();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

}