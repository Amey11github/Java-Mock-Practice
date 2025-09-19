import java.util.*;

class NumPrimeOrNot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt();

		if(isPrime(no))
		{
			System.out.println(no+" is prime");
		}
		else{
			System.out.println(no+" is not prime");
		}
		
	}

	public static boolean isPrime(int no)
	{
		int cnt=0;
		for(int i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		if(cnt==1)
			return true;

		return false;
	}
}