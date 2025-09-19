import java.util.*;

class PalindromeNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt();

		if(isPalindrome(no))
		{
			System.out.println(no+" is palindrome");
		}
		else{
			System.out.println(no+" is not palindrome");
		}
	}

	public static boolean isPalindrome(int no)
	{
		int num=no;
		int rev=0;

		while(no!=0)
		{
			rev=rev*10+(no%10);
			no=no/10;
		}

		System.out.println(rev);

		if(num==rev)
		{
			return true;
		}

		return false;
	}
}