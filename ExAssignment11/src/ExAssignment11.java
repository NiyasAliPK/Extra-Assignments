import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExAssignment11 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of array :");
	int size=input.nextInt();
	System.out.println("Enter the values for array :");
	int arr[]=new int [size];
	int count=0;
	int arr2[]=new int [size];
	
	for(int i=0;i<size;i++) {
		arr[i]=input.nextInt();
	}
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
		if(arr[i]==arr[j]) {
			count++;
			arr2[i]=arr[i];
		}
		}
	}
	Set<Integer> set=new HashSet<>();
	for(int k=0;k<size;k++) {
		if(arr2[k]!=0) {
			set.add(arr2[k]);
		}
	}
	System.out.println("Repeated numbers in array :");
	for (int i = 0; i < set.size(); i++) {
		System.out.print(set);
	}
}
}
