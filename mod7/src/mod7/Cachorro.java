package mod7;

public class Cachorro {
	private String nome;
	private String raca;
	private String nomeDono;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
public void latir() { //funcao para "latir"
	System.out.println(this.nome+ " disse "+ "Au Au Au");
}

public void identificaCachorro() { //retorna os dados do cachorro.
	System.out.println("O nome do Cachorro é: "+this.nome+",sua raca é: "+this.raca+" e seu dono é: "+this.nomeDono);
}

/**
 * @author Joao
 */
}
