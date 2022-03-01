import java.util.Scanner;

public class ExAssignment16 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of students :");
	int num=input.nextInt();
	int ans=((num*num)-num)/2;
	System.out.println("The number of handshakes is = "+ans);
}
}
