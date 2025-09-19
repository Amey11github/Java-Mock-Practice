class ArrayEx6
{
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70,80,90};
		int left=0,right=arr.length-1;
		int key=80;

		for(int i=0;i<arr.length;i++)
		{
			int mid=(left+right)/2;
			if(key>arr[mid])
			{
				left=mid+1;
			}
			else if(key<arr[mid])
			{
				right=mid-1;
			}
			else{
				System.out.print(mid);break;
			}
		}
	}
}