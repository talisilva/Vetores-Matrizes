package EXERCICIOS;

import java.util.Scanner;

public class Quest1 {

	public static void main(String [] args) {
		
	Scanner ler = new Scanner(System.in);
	
	int [] notas = new int [5];

	int maior = 0;
	

	System.out.println("Digite os pontos: \n");
	for(int i = 0; i < 5; i++) {
	notas[i] = ler.nextInt();
	
	if(notas[i] > maior) {
		maior = notas[i];
	}
	System.out.println("A maior nota é: " + maior);
	}
}

}

