import java.util.*;
public class hello {
	public static void main(String[] args) {
		Scanner userInputScanner=new Scanner(System.in);
		System.out.print("What's your name ");
		String userInputName=userInputScanner.nextLine();
		System.out.println("Hello "+ userInputName+"!");
	}
}
