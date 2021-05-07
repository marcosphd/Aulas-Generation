package lacos.de.repeyicao;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

public class Ex1_For {

	public static void main(String[] args) {

		for (int number = 1000; number <= 1999; number++)
		{
			if (number%11 == 5) 
			{
				System.out.println(number);
			}
		}
	}
}
