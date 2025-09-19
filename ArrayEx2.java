import java.util.*;

class ArrayEx2
{
	public static void main(String[] args) {
		int [] arr={10,40,2,60,30,90,50};
		int left=0;
		int right=arr.length-1;

		for(int i=right;i>=left;i--)
		{
			int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
		}

		System.out.println(Arrays.toString(arr));
	}
}