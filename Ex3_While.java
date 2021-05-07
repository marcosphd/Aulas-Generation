package lacos.de.repeyicao;
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 * */

import java.util.Scanner;
public class Ex3_While {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while(idade != -99 ){
			
			System.out.print("Qual a sua idade? ");
			idade = leia.nextInt();

			if(idade < 21) {
				
				menor++;
				
			} else if(idade > 50) {
				
				maior++;
			}
			
		} 
		
		leia.close();
		System.out.println("Total de pessoas com menos de 21 anos: " + menor);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior);
		System.out.println("FIM DO PROGRAMA");
		
	}
}
