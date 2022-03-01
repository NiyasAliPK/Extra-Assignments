import java.util.Scanner;

public class ExAssignment13 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for array");
	int size=input.nextInt();
	System.out.println("Enter the elemetns for array ");
	int arr[]=new int [size];
	for(int i=0;i<size;i++) {
		arr[i]=input.nextInt();
}
	int Bnum=Max(arr,size);
	System.out.println("The maximum value of array is = "+Bnum);
}
static int Max(int arr [],int size) {
	int temp=0;
	for(int j=0;j<size;j++) {
		if(arr[j]>temp) {
			temp=arr[j];
		}
	}
	return temp;
}
}
