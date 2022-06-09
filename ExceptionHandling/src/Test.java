import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int z=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		try {
			b=sc.nextInt();
			z=10/b;
		}
		catch(InputMismatchException ex) {
			System.out.println("Please enter numbers");
		}
		catch(ArithmeticException ex1) {
			System.out.println("cannot divide by zero");
			}
            System.out.println("Result is " +z);
	}

}
