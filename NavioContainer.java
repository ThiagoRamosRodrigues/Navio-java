public class NavioContainer extends Navio {
	private int quantidadeGuindastes;
	private int quantidadeCamadas;

	public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade,
			int quantidadeGuindastes, int quantidadeCamadas) {
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeGuindastes = quantidadeGuindastes;
		this.quantidadeCamadas = quantidadeCamadas;
	}

	public int getQuantidadeGuindastes() {
		return quantidadeGuindastes;
	}

	public void setQuantidadeGuindastes(int quantidadeGuindastes) {
		this.quantidadeGuindastes = quantidadeGuindastes;
	}

	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}

	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}
	@Override
	public String toString() {
		
		return "\n   Navios Porta - contaire:\n"    +
			   "\nID                        : "       + this.getId                () +
			   "\nNome                      : "     + this.getNome                () +
			   "\nQuantidade de porões      : "     + this.getQuantidadePoroes    () +
			   "\nQuantidades de guindastes : "     + this.getQuantidadeGuindastes() +
			   "\nQuantidade de Camadas     : "     + this.getQuantidadeCamadas   () +
			   "\n\n       STATUS DO NAVIO     \n"  +
			   "" + this.getDisponibilidade();
			  
	}
}