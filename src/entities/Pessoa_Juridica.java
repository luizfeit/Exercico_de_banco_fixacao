package entities;

public class Pessoa_Juridica extends Usuario{
  private Integer funcionario;

  
  public Pessoa_Juridica() {
	  super();
  }

public Pessoa_Juridica(String nome, Double rendaAnual, Integer funcionario) {
	super(nome, rendaAnual);
	this.funcionario = funcionario;
}


public Integer getFuncionario() {
	return funcionario;
}

public void setFuncionario(Integer funcionario) {
	this.funcionario = funcionario;
}

@Override
  public Double imposto() {
	  if(funcionario<=9) {
		  return getRendaAnual()*0.16;
	  }
	  else {
		  return getRendaAnual()*0.14;
	  }
  }
      
}
