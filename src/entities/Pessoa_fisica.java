package entities;

public class Pessoa_fisica extends Usuario{

	private double gastoSaude;
	
	public Pessoa_fisica() {
		super();
	}

	public Pessoa_fisica(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}



	public double getSaude() {
		return gastoSaude;
	}

	public void setSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double imposto(){
		if(getRendaAnual()<20000.00)
		{
			return getRendaAnual()*0.15-gastoSaude*0.5;
		}
		else {
			return getRendaAnual()*0.25-gastoSaude*0.5;
		}
	}
}
