
public class Cliente {

	private String nome;
	private Conta contaPoupanca;
	private Conta contaCorrente;

	public Cliente(String nome){
		this.nome = nome;
	}

	public Conta getConta(int numConta){
		return numConta == 0 ? this.contaCorrente : this.contaPoupanca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(Conta contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public Conta getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(Conta contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

}