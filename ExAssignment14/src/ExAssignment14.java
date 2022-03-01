import java.util.Scanner;

public class ExAssignment14 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=input.nextInt();
	int ans=Fib(num);
	System.out.println(ans);
}
static int Fib(int num) {
	int n;
	if(num<=1)
		return num;	
    n=Fib(num-1)+Fib(num-2);
	return n;
}
}

