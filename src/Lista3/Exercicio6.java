package Lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, 
		// que leia números inteiros via teclado, até que o número zero seja digitado. 
		// Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
		
		//  Na construção do Algoritmo, utilize os seguintes conteúdos:
		//	Entrada e Saída de dados
		//	Operadores
		//	Laços Condicionais
		//	Laço de Repetição DO...WHILE
		
		Scanner sc = new Scanner(System.in);
		
		int numero, soma=0, cont=0;
		double media;
		
		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				cont++;
			}
		} while (numero != 0);
		
		if(cont != 0) {
			media = (double) soma / cont;
			System.out.printf("A média de todos os números multiplos de 3 é: %.2f",media);
		}
		
		
		


	}

}
