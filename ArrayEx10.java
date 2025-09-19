import java.util.*;

class ArrayEx10
{
	public static void main(String[] args) {
		int [] arr1={10,20,30,40};
		int [] arr2={50,60,70,80,90};

		int [] arrOp=new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++)
		{
			arrOp[i]=arr1[i];
		}
		int c=arr1.length;
		for(int j=0;j<arr2.length;j++)
		{
            arrOp[c++]=arr2[j];
		}

		System.out.println(Arrays.toString(arrOp));
	}

}