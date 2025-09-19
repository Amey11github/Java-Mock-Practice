class ArrayEx5
{
	public static void main(String[] args) {
		int [] arr={10,40,10,2,60,30,90,50};
		
		int key=60;
		int op=0;

		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				op=i;
		}

		System.out.print(op);
	}
}