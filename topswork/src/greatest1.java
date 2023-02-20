package topswork;
import java.util.Scanner;
public class greatest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = sc.nextInt();

		        System.out.print("Enter the third number: ");
		        int num3 = sc.nextInt();

		        int greatest = num1;

		        if (num2 > greatest) {
		            greatest = num2;
		        }

		        if (num3 > greatest) {
		            greatest = num3;
		        }

		        System.out.println("The greatest number is " + greatest);
		    
	}

}
