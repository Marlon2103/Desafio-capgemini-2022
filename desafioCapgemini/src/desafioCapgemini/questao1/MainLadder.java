package desafioCapgemini.questao1;

import java.util.Scanner;

/*
 * @brief imprimi uma escada com n degraus e n arteriscos por degrau
 * centralizado a direita
 * */

public class MainLadder {

	public static void main(String[] args) {

		System.out.print("N = ");
		Scanner sc = new Scanner(System.in);

		Ladder escada = new Ladder();
		int number = sc.nextInt();

		escada.PrintLadder(number);
		sc.close();
	}
}