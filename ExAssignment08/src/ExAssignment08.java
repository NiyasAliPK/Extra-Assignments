import java.util.Scanner;

public class ExAssignment08 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int arr[]=new int [100];
	System.out.println("Enter size for array");
	int size=input.nextInt();
	System.out.println("Enter values for array ");
	for(int i=0;i<size;i++) {
		arr[i]=input.nextInt();
	}
	for(int j=0;j<size;j++) {
		for(int k=j+1;k<size;k++) {
			if(arr[j]<arr[k]) {
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
			}
		}
	}
	System.out.println("Array after sorting in descending order :");
	for(int m=0;m<size;m++) {
		System.out.print(+arr[m]+",");
	}
}
}
