import java.util.Scanner;

public class ExAssignment18 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word to change into uppercase :");
		String word=input.next();
		for(int i=0;i<word.length();i++) {
			int c=word.charAt(i);
			if(c>96&&c<122) {
				System.out.println(word.toUpperCase());
				break;
			}
			}	
	}
}
