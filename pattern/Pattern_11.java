package pattern;
 
import java.util.Scanner;

	public class Pattern_11 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int rows = sc.nextInt();
//			for (int i = 0; i < a; i++) {
//				for (int j = 0; j < a; j++) {
//					System.out.print("*");
//
//				}
//				System.out.println(" ");
//			}
			for (int i = rows; i >= 1; i--) {
			      // Inner loop for spaces
			      for (int j = 1; j <= rows - i; j++) {
			        System.out.print(" ");
			      }

			      // Inner loop for stars
			      for (int k = 1; k <= i; k++) {
			        System.out.print("*"+" ");
			      }

			      // New line
			      System.out.println();
			    }
			for (int i = 1; i <=rows; i++) {
			      // Inner loop for spaces
			      for (int j = 1; j <= rows - i; j++) {
			        System.out.print(" ");
			      }

			      // Inner loop for stars
			      for (int k = 1; k <= i; k++) {
			        System.out.print("*"+" ");
			      }

			      // New line
			      System.out.println();
			    }
		}

	}


