import java.util.Scanner;

public class ExAssignment07 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Word :");
	String word=input.nextLine();
	System.out.println("Enter the word you want to search :");
	String text=sc.next();
	int pos=word.indexOf(text);
	System.out.println("position of word is "+(pos+1));
}
}
