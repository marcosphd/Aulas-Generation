package lacos.de.repeyicao;
/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/

import java.util.Scanner;
public class Ex5_DoWhile {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, total = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();	
			total += numero;
		} while(numero != 0);
		System.out.println("A soma entre todos os numero digitado �: " + total);		
	}
}
