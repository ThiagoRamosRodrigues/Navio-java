public class NavioGraneleiro extends Navio {
	private int quantidadeEscotilhas;

	public NavioGraneleiro(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade,
			int quantidadeEscotilhas) {
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}
	@Override
	public String toString() {
		
		return "\n   Navios Porta - contaire:\n"    +
			   "\nID                        : "       + this.getId                () +
			   "\nNome                      : "     + this.getNome                () +
			   "\nQuantidade de porões      : "     + this.getQuantidadePoroes    () +
			   "\n\n       STATUS DO NAVIO     \n"  +
			   "" + this.getDisponibilidade()       +
			   "\n_____________";
	}

}