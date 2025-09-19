class PrimeBetween1To100
{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int cnt=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==1)
				System.out.print(i+" ");
		}
	}
}