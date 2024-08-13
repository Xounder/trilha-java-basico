import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

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
	
	// transferir usando o cliente e o tipo da conta
	public void transferir(Cliente cliente1, int tipoConta1, Cliente cliente2, int tipoConta2, double valor){
		cliente1.getConta(tipoConta1).transferir(valor, cliente2.getConta(tipoConta2));
	}

	// transferir usando o numero da conta que existe na Agencia
	public void transferir(Cliente cliente1, int tipoConta1, int numeroConta, double valor){
		Conta contaCliente1 = cliente1.getConta(tipoConta1);
		if (numeroConta == contaCliente1.getNumero()){
			System.err.println("~~~~ Não é possivel realizar transferencia para a mesma conta ~~~~");
			return;
		}

		Optional<Conta> contaCliente2 = contas.stream().filter(n -> n.getNumero() == numeroConta).findFirst();
		if (contaCliente2.isPresent()){
			contaCliente1.transferir(valor, contaCliente2.get());
		} else{
			System.err.println("~~~~ Numero da Agencia ou Conta Invalidos! ~~~~");
		}
	}

	public void sacar(Cliente cliente, int tipoConta, double valor){
		cliente.getConta(tipoConta).sacar(valor);
	}

	public void depositar(Cliente cliente, int tipoConta, double valor){
		cliente.getConta(tipoConta).depositar(valor);
	}

	public void imprimirExtrato(Cliente cliente, int tipoConta){
		cliente.getConta(tipoConta).imprimirExtrato();
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