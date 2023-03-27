
public abstract class Navio {
	private int id;
	private String nome;
	private int quantidadePoroes;
	private double capacidadeCarga;
	private String disponibilidade;

	public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadePoroes = quantidadePoroes;
		this.capacidadeCarga = capacidadeCarga;
		this.disponibilidade = "VAZIO";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadePoroes() {
		return quantidadePoroes;
	}

	public void setQuantidadePoroes(int quantidadePoroes) {
		this.quantidadePoroes = quantidadePoroes;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public void iniciarCarregamento() {
		disponibilidade = "CARREGANDO";
	}

	public void bloquearCarregamento() {
		disponibilidade = "LOTADO";
	}

	@Override
	public String toString() {
		
		return "\n   Navios Porta - contaire:\n"    +
			   "\nID                        : "       + this.getId                () +
			   "\nNome                      : "     + this.getNome                () +
			   "\nQuantidade de porões      : "     + this.getQuantidadePoroes    () +
			   "\n\n       STATUS DO NAVIO     \n"  +
			   "" + this.getDisponibilidade();       
			  
	}
}