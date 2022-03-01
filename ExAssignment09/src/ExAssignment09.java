import java.util.Scanner;

public class ExAssignment09 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a character to get its ASCII value :");
	char c=input.next().charAt(0);
	int a=c;//by assigning a char to int the char value automatically converts to its ASCCI value
	System.out.println("The ASCII value of "+c+" is "+a);
}
}
