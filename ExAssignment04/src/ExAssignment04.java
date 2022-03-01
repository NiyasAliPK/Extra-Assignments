import java.util.Scanner;

public class ExAssignment04 {
	Scanner sc=new Scanner(System.in);
	int length=0;
	
public static void main(String[] args) {
	ExAssignment04 obj=new ExAssignment04();
	Scanner input=new Scanner(System.in);
	while(true) {
	System.out.println("Enter your choice\na.String Length\nb.String Concatenation\nc.String Reverse\nd.Exit");
	String opt=input.next();
	char choice=opt.charAt(0);

	switch(choice) {
	case 'a':
		obj.STRINGLENGTH();
		break;
	case 'b':
		obj.STRINGCONCATENATION();
		break;
	case 'c':
		obj.STRINGREVERSE();
		break;
	case 'd':
		obj.EXIT();
		break;
	default:
		System.out.println("Enter a valid choice :");
		break;
	}
	System.out.println("______________________________");
}
}

 void STRINGLENGTH() {
	System.out.println("Enter a String :");	
	String str=sc.next();
	for(int i=0;i<=str.length()-1;i++) {
		length++;
	}
	System.out.println("The length of String ="+length);
}
void STRINGCONCATENATION() {
	System.out.println("Enter the first string :");
	String str1=sc.next();
	System.out.println("Enter the second string :");
	String str2=sc.next();
	String merge;
	merge=str1+str2;
	System.out.println("The Concantenated string ="+merge);
}
void STRINGREVERSE() {
	System.out.println("Enter a string :");
	String str=sc.next();
	System.out.print("The reversed string =");
	for(int j=str.length()-1;j>=0;j--) {
		System.out.print(str.charAt(j));
	}
	System.out.println();
}
void EXIT() {
	System.out.print("USER EXITED\n");
	System.exit(0);
}
}
