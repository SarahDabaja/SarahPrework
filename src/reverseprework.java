import java.util.Scanner;

public class reverseprework {
	private static Scanner in;
	
	public static void main(String[] args) {
		int n, reverse = 0;
		//int is displayed as n.
		
		System.out.println("Type a number");
		//This line will show the written text.
		
		in = new Scanner(System.in);
		n = in.nextInt();
		
		while (n != 0){
		//The while loop will calculate the reverse number.	
			reverse = reverse * 10;
			reverse = reverse + n%10;
			
			n = n/10;
		}
		System.out.println("This is your number reversed: " + reverse);
		//This line will show the written text with the number calculated by the while loop. 
	}

}
