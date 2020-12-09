package entities;

public abstract class Usuario {

	  private String nome;
      private Double rendaAnual;
      
      public Usuario() {
      }


      public Usuario(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
    public abstract Double imposto();
}

