import java.util.*;

class FibonacciSeries
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt();

		int a=0,b=1;

		System.out.print(a+" "+b+" ");

		for(int i=1;i<=no;i++)
		{
			int next=a+b;
			System.out.print(next+" ");
			a=b;
			b=next;
		}
	}
	
}