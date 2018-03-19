package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {

		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre...");
		Scanner question = new Scanner(System.in);
		int a = question.nextInt();
		System.out.println("Veuillez saisir le second nombre...");
		int b = question.nextInt();

		if (b <= 0) {
			System.out.println("Le second nombre doit être strictement positif");

		} else {
			int result = a + b;
			System.out.println(a + " + " + b + " = " + result);
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);
			result = a * b;
			System.out.println(a + " * " + b + " = " + result);
			result = a / b;
			System.out.println(a + " / " + b + " = " + result);
			result = a % b;
			System.out.println(a + " % " + b + " = " + result);
		}
	}
}
