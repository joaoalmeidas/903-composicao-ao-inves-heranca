
public class ComissaoEmpregado extends Object{
	
	private final String nome;
	private final String sobrenome;
	private final String numeroSeguroSocial;
	private double vendasBrutas;
	private double taxaDeComissao;
	
	public ComissaoEmpregado(String nome, String sobrenome, String numeroSeguroSocial, double vendasBrutas, double taxaDeComissao) {
		
		if(vendasBrutas < 0.0) {
			
			throw new IllegalArgumentException("Vendas brutas devem ser maiores que >= 0.0");
			
		}
		
		if(taxaDeComissao <= 0.0 || taxaDeComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de Comissão precisa estar entre 0.0 e 1.0");
			
		}
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.vendasBrutas = vendasBrutas;
		this.taxaDeComissao = taxaDeComissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		
		if(vendasBrutas < 0.0) {
			
			throw new IllegalArgumentException("Vendas brutas devem ser maiores que >= 0.0");
			
		}
		
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		
		if(taxaDeComissao <= 0.0 || taxaDeComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de Comissão precisa estar entre 0.0 e 1.0");
			
		}
		
		this.taxaDeComissao = taxaDeComissao;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	public double ganhos() {
		
		return getTaxaDeComissao() * getVendasBrutas();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Comissão do Empregado", getNome(), getSobrenome(),
				"Número do Seguro Social", getNumeroSeguroSocial(), "Vendas Totais", getVendasBrutas(), "Taxa de Comissão", getTaxaDeComissao());
		
	}
	
	

}
