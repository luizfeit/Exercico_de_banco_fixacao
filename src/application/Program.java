package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa_Juridica;
import entities.Pessoa_fisica;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 List<Usuario> list=new ArrayList<>();
		 
		 System.out.print("Enter the number of tax payers: ");
		 int n=sc.nextInt();
		 
		 for(int i=1;i<=n;i++) {
			 System.out.println("Tax payer #"+i+" data:");
			 System.out.print("Individual or company (i/c)? ");
			 char ch=sc.next().charAt(0);
			 
			 if(ch=='i') {
				 sc.nextLine();
				 System.out.print("Name: ");
				 String nome=sc.nextLine();
				 System.out.print("Anual income: ");
				 Double rendaAnual=sc.nextDouble();
				 System.out.print("Health expenditures: ");
				 Double gastoSaude=sc.nextDouble();
				 list.add(new Pessoa_fisica(nome, rendaAnual, gastoSaude));
			 }
			 else if(ch=='c') {
				 sc.nextLine();
				 System.out.print("Name: ");
				 String nome=sc.nextLine();
				 System.out.print("Anual income: ");
				 Double rendaAnual=sc.nextDouble();
				 System.out.print("Number of employees:");
				 Integer funcionario=sc.nextInt();
				 list.add(new Pessoa_Juridica(nome, rendaAnual, funcionario));
			 }
		 }
		 
		 Double sum=0.0;
		 
		 System.out.println();
		 System.out.println("Taxes Paid:");
		 for(Usuario usu: list)
		 {
			 double tax=usu.imposto();
			 System.out.println(usu.getNome()+ ": $"+String.format("%.2f", tax));
			 sum += tax;
		 }
		 
		    System.out.println();
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		 
		 
		 sc.close();
	}

}
