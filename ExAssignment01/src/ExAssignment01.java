import java.util.Scanner;

public class ExAssignment01 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Crossroads");
	String word=input.nextLine();
	int count=1;
	rec(word,count);
}
static void rec(String word,int count) {
	if(count<8) {
	System.out.println(word);
	count++;
	rec(word,count);
	}else {
		System.exit(0);
	}
}
}
