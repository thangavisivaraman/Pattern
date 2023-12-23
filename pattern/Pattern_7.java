package pattern;

import java.util.Scanner;

	public class Pattern_7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int a = sc.nextInt();
			for (int i = 0; i <= a - 1; i++) {
				for (int j = 1; j <= (2 * i - 1); j++) {
					if (i == 1 || j == 1 || j == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
			for (int i = a; i >= 1; i--) {
				for (int j = 1; j <= (2 * i - 1); j++) {
					if (j == 1 || j == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}

		}

	}

