import java.util.Scanner;

public class ExAssignment12 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a string containing letters,numbers and special characters :");
	String word=input.nextLine();
	ExAssignment12 obj=new ExAssignment12();
	obj.Counter(word);

}
void Counter(String word) {
	int digicount=0;
	int lettercount=0;
	int spcount=0;
	for(int i=0;i<word.length();i++) {
		int a=word.charAt(i);
		if(a>96&&a<122) {
			lettercount++;
		}else if(a>64&&a<91) {
			lettercount++;
		}else if(a>47&&a<58) {
			digicount++;
		}else {
			spcount++;
		}
	}
	System.out.println("Number of Alphabets in this string = "+lettercount);
	System.out.println("Number of digits in this string = "+digicount);
	System.out.println("Numbre of special characters in this string = "+spcount);
	}
}
