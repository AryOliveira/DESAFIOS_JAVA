import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdAtletas, qtdHomens, qtdMulheres ;
		String nome, sexo, nomeMaisAlto = null;
		double altura = 0, peso = 0, somaPesos, pesoMedio = 0, maiorAltura;
		double somaAlturaMulheres, alturaMediaMulheres, porcentagemHomens;

		
		 System.out.println("Qual a quantidade de atletas? ");
		  qtdAtletas = sc.nextInt();
		
		somaPesos = 0;
		somaAlturaMulheres = 0;
		maiorAltura = 0;
		qtdHomens = 0;
		qtdMulheres = 0;
		porcentagemHomens = 0;
		alturaMediaMulheres = 0;
		
		//Leitura dos dados de cada Atleta
		
		for (int i=1; i<=qtdAtletas; i++) {
			
			System.out.println("Digite os dados do atleta numero: " +  i);

			System.out.printf("Nome: ");
		    nome = sc.next();

		    System.out.println("Sexo: " );
		    sexo = sc.next();
		    
		    while (!sexo.equals("F") && !sexo.equals("M")){
		    	sexo = sc.next();
		    	System.out.println("Valor Invalido! Favor Digitar F ou M: ");
		    	
		    }
		    System.out.println("Altura: " );
		    altura = sc.nextDouble(); 
		    
		    while (altura <= 0.0){
		    	System.out.println("Valor Invalido! Favor Digitar um valor positivo: ");
		    	altura = sc.nextDouble();
		    }
		    System.out.println("Peso: " );
		    peso = sc.nextDouble();
		    
		    while (peso <= 0.0){
		    	System.out.println("Valor Invalido! Favor Digitar um valor positivo: ");
		    	peso = sc.nextDouble();
		    }
		    // Cálculo auxiliar para: Peso medio dos atletas
		    somaPesos = somaPesos + peso;
		    pesoMedio = somaPesos / qtdAtletas;	
		    
		    // Atleta mais alto
		      if (altura > maiorAltura) {
		    	  nomeMaisAlto = nome;
		    	  maiorAltura = altura;
		      }
		   // Cálculo auxiliar para: Porcentagem de homens
		      if (sexo.equals("M")) {
		    	  qtdHomens = qtdHomens + 1;	
		    	  porcentagemHomens = (qtdHomens / qtdAtletas) * 100;
		      }
		   // Cálculo Media das Mulheres
		      if (sexo.equals("F")) {
		    	  somaAlturaMulheres = somaAlturaMulheres + altura;
		    	  qtdMulheres = qtdMulheres + 1;		    	  
		      }
		}
		
		System.out.println("RELATÓRIO");
		System.out.println();
		System.out.printf("Peso Médio dos Atletas: %.2f %%%n ", pesoMedio);
		System.out.println("Atleta mais Alto: " +  nomeMaisAlto);
		System.out.printf("Porcentagem de Homens: %.2f %%%n ", porcentagemHomens);
		
		
		 // Verificar se tem Mulhers
	      if (qtdMulheres == 0 && alturaMediaMulheres == 0)  {
	    	  System.out.println("Não há Mulheres cadastradas!");	    	  	    	  
	      }
	      else {
	    	  alturaMediaMulheres = somaAlturaMulheres / qtdMulheres;
	    	  System.out.printf("Altura Média das Mulheres: %.2f %%%n ", alturaMediaMulheres);
	      }
		
		
				
		sc.close();
	}

}
