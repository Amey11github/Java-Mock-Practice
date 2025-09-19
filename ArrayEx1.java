class ArrayEx1
{
	public static void main(String[] args) {
		int [] arr={10,40,2,60,30,90,50};

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}

			if(arr[i]<min)
			{
				min=arr[i];
			}
		}

		System.out.println("min : "+min);
		System.out.println("max : "+max);
	}
}