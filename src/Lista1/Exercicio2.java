package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pares=0,impares=0,num=0,x;
		
		for(x = 1; x <= 10; x++) {
			System.out.println("Digite o numero: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Total de números pares: "+pares);
		System.out.println("Total de números impares: "+impares);
		
		
		
		sc.close();

	}

}
