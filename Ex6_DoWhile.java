package lacos.de.repeyicao;
/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 * */

import java.util.Scanner;

public class Ex6_DoWhile {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, quantidade = 0, soma = 0, media;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0){
				
				soma = soma + numero;
				quantidade++;
			}
		}while(numero != 0);
		
		media = soma/quantidade;
		System.out.println("A media entre os numero digitados é de: " + media);
		
		
	}
}
