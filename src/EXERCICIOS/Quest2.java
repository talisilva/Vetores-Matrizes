package EXERCICIOS;

import java.util.Scanner;

public class Quest2 {

public static void main(String [] args) {

Scanner ler = new Scanner(System.in);
	
	double [] notas = new double [10];

	double soma = 0.0;
	
	double maiorpontuacao = 0, media = 0; 
    int x;
	double maior = 0.0;
	
	for(x = 0; x <= 9; x++) {
	System.out.println("Digite os Lan�amentos: \n");
	notas[x] = ler.nextInt();	
	soma = soma + notas[x];
	media = soma / 10;
	
	if(notas[x] == maior){
		maiorpontuacao++;
	}
	
	if(maior < notas[x]) {
		maior = notas[x];
	}
	

}
	System.out.println("A soma dos lan�amentos �: " + soma);
	System.out.println("\nA m�dia dos lan�amentos �: " + media);
	System.out.println("\nA quantidade do maior lan�amento �: " + ( maiorpontuacao + 1)  + " e o maior lan�amento foi: " + maior);
}
}
		
	
		
	
	

