
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		// Tarefas de saque/deposito/transferencias/extrato delegadas ao banco
		Banco banco = new Banco();
		banco.criarConta(venilton);
		// conta=0 Corrente || conta=1 Poupanca
		banco.depositar(venilton, 0, 100);
		banco.transferir(venilton, 0, venilton, 1, 100);
		
		banco.imprimirExtrato(venilton, 0);
		banco.imprimirExtrato(venilton, 1);
	}

}