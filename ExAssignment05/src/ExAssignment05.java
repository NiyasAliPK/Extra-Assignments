import java.util.Scanner;

public class ExAssignment05 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str=input.next();
		System.out.println("Enter the second string :");
		String str2=input.next();
		String temp;
		temp=str;
		str=str2;
		str2=temp;
		System.out.println("After copying");
		System.out.println("String 1= "+str);
		System.out.println("String 2= "+str2);
	}

}
