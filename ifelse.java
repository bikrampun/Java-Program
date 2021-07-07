import java.util.*;
public class ifelse {
	public static void main(String[] args) {
		Scanner userInputScanner=new Scanner(System.in);
		int a,b;
		System.out.print("Enter number: ");
		a=userInputScanner.nextInt();
		System.out.print("Enter number: ");
		b=userInputScanner.nextInt();
		System.out.println();
		System.out.println("The entered number are "+a+","+b);
		System.out.println();
		System.out.println("Checking... which is greater.");
		if(a>b) 
			System.out.println(a+" is the greater than "+b);
		else
			System.out.println(b+" is greater than "+a);
	
	}
}
