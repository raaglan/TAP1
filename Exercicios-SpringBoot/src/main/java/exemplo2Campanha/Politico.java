package exemplo2Campanha;

public class Politico {

	private String nome;
	private int numero;
	
	public Politico(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Politico [nome=" + nome + ", numero=" + numero + "]";
	}
}
