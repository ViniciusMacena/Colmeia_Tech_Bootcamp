package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade=0, contMenor=0, contMaior=0;
		
		while(idade >= 0) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt(contMaior);
			if (idade >= 1 && idade < 21) {
				contMenor++;
			} else if(idade > 50 ) {
				contMaior++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+ contMenor);
		System.out.println("Total de pessoas com mais de 50 anos: "+ contMaior);
		
		
		
		sc.close();

	}

}
