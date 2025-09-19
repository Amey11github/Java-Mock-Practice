import java.util.*;

class Swap2Nowithout3rdNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No 1 :");
		int a=sc.nextInt();

		System.out.println("Enter No 2 :");
		int b=sc.nextInt();

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}