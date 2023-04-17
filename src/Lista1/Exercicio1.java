package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,x;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Intervalo invalido!!!");
		}
		
		for(x = num1; x < num2; x++) {
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println(x+" é multiplo de 3 e 5");
			}
		}
		
		
		
		
		
		sc.close();
	}

}
