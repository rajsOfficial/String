import java.util.Scanner;
public class Parseint {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String y= s.nextLine();
		
		System.out.println(y);
		int a = Integer.parseInt(y,16); // considers the string as hexa decimal value
		System.out.println("after parsing"+a);
		
		
	}
}
