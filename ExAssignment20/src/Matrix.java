
public class Matrix {
static int [][] Addition(int arr[][],int arr2[][],int size) {
	int temp[][]=new int[size][size];
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			temp[i][j]=arr[i][j]+arr2[i][j];
		}
	}
	return temp;
}
static int [][] Multiplication(int arr[][],int arr2[][],int size){
	int temp[][]=new int[size][size];
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			temp[i][j]=arr[i][j]*arr2[i][j];
		}
	}
	return temp;
}
static int [][] Substraction(int arr[][],int arr2[][],int size){
	int temp[][]=new int[size][size];
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			temp[i][j]=arr[i][j]-arr2[i][j];
		}
	}
	return temp;
}
static void Exit() {
	System.out.println("USER EXITED");
	System.exit(0);
}
static int [][] Transpose(int arr[][],int size){
	int temp[][]=new int[size][size];
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			temp[i][j]=arr[j][i];
			
		}
	}
	return temp;
}
}
