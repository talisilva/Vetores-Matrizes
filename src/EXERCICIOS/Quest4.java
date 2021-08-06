package EXERCICIOS;

import java.util.Scanner;

public class Quest4 {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int [][] M1=new int [3][3];
		int soma=0,somadiagonal=0,l,c;
		
		
		System.out.println("Digite os valores da matrizes");
		for( l=0;l< M1.length;l++) {
			for(c=0;c<M1[l].length;c++) {
				M1[l][c]=entrada.nextInt();
				soma+=M1[l][c];
				
				if(l==c) {
					somadiagonal+=M1[l][c];
				
		
		}	
		System.out.println("A soma total dos elemento foi de : "+soma);
		System.out.println("A soma diagonal dos elemento foi de : "+somadiagonal);
	}

}
	}
}
