package lacos.de.repeyicao;
/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
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
		System.out.println("A soma entre todos os numero digitado é: " + total);		
	}
}
