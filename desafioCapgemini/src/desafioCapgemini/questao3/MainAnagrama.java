package desafioCapgemini.questao3;

import java.util.Scanner;

/*
 * @brief mostra o numero de anagramas possiveis nas substrings
 * 
 * */

public class MainAnagrama {

	public static void main(String[] args) {
		
		System.out.print("Digite a palavra: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringUtils c = new StringUtils();

		System.out.println(c.compararSubstring(c.geradorNSubstring(str)));
		sc.close();
		
	

	}
}