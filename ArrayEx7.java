import java.util.*;

class ArrayEx7
{
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50,60,70,80,90};
		int rot=2;

		for(int i=1;i<=rot;i++)
		{
			int temp=arr[0];
			for(int j=1;j<arr.length;j++)
			{
                arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}