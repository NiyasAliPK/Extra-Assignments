import java.util.Scanner;

public class ExAssignment06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of movie names you want to sort :");
		int size=input.nextInt();
		String str[]=new String[size];
		String temp;
		System.out.println("Enter the name of movies :");
		for(int i=0;i<size;i++) {
			str[i]=input.next();
		}
		for(int k=0;k<size;k++) {
			for(int j=k+1;j<size;j++) {
				if(str[k].compareTo(str[j])>0) {//if str[k] is bigger than str[j] compareTo function will return 1 hence the sorting loop will run
					temp=str[k];
					str[k]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("the sorted list is :");
		for(int m=0;m<size;m++) {
			System.out.println(str[m]);
		}
	}
}
