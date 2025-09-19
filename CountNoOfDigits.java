import java.util.*;

class CountNoOfDigits
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt();

		int cnt=0;

		while(no!=0)
		{
			no=no/10;
			cnt++;
		}

		System.out.println("No of Digits : "+no+" : "+cnt);
	}
}