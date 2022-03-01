import java.util.Scanner;

public class ExAssignment19 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the weight of your parcel in grams to calculate the parcel charge :");
	int weight=input.nextInt();
	
	if(weight<=500) {
		System.out.println("Your parcel charge = 200");
	}else if(weight>500) {
		int n=weight/500;
		n=n-1;
		int amt=(n*170)+200;
		System.out.println("Your parcel chare = "+amt);
	}else {
		System.out.println("Enter a valid input :");
	}
}
}
