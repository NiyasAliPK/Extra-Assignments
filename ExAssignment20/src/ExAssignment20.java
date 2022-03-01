import java.util.Scanner;

public class ExAssignment20 extends Matrix {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	while(true) {
	System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*\nEnter the size for matrix");
	int size=input.nextInt();
	int arr[][]=new int [size][size];
	int arr2[][]=new int [size][size];
	int ans[][]=new int [size][size];
	int k,l;
	
		System.out.println("Enter your choice\n_____________________\n1.Addition\n2.Multiplication\n3.Substraction\n4.Transpose\n5.Exit");
		int choice=input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the values for matrix :");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					arr[i][j]=input.nextInt();
				}
			}
			System.out.println("Enter the values for matrix 2 :");
			for(int m=0;m<size;m++) {
				for(int n=0;n<size;n++) {
					arr2[m][n]=input.nextInt();
				}
			}
			ans=Addition(arr,arr2,size);
			for(k=0;k<size;k++) {
				for(l=0;l<size;l++) {
					System.out.print(ans[k][l]+"\t");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("Enter the values for matrix :");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					arr[i][j]=input.nextInt();
				}
			}
			System.out.println("Enter the values for matrix 2 :");
			for(int m=0;m<size;m++) {
				for(int n=0;n<size;n++) {
					arr2[m][n]=input.nextInt();
				}
			}
			ans=Multiplication(arr, arr2, size);
			for(k=0;k<size;k++) {
				for(l=0;l<size;l++) {
					System.out.print(ans[k][l]+"\t");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("Enter the values for matrix :");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					arr[i][j]=input.nextInt();
				}
			}
			System.out.println("Enter the values for matrix 2 :");
			for(int m=0;m<size;m++) {
				for(int n=0;n<size;n++) {
					arr2[m][n]=input.nextInt();
				}
			}
			ans=Substraction(arr, arr2, size);
			for(k=0;k<size;k++) {
				for(l=0;l<size;l++) {
					System.out.print(ans[k][l]+"\t");
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("Enter the values for matrix :");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					arr[i][j]=input.nextInt();
				}
			}
			ans=Transpose(arr,size);
			for(k=0;k<size;k++) {
				for(l=0;l<size;l++) {
					System.out.print(ans[k][l]+"\t");
				}
				System.out.println();
			}
			break;
		case 5:
			Exit();
			break;
		default:
			System.out.println("Enter a valid number...");	
		}
	}
}
}
