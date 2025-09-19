import java.util.*;

class ArrayEx3
{
	public static void main(String[] args) {
		int [] arr={10,40,2,60,30,90,50};

		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		
	}
}