package Lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,soma=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			
			if(numero > 0) {
				soma += numero;
			}
		} while(numero != 0);
		
		System.out.println("A soma dos números positivos é: "+soma);
			
		
		
		
		
		
		
		
		
		sc.close();

	}

}
