class StackEx<E>
{
	static final int INITIAL_CAPACITY=10;
	E [] arr;
	int indx=0;


	StackEx()
	{
        arr=(E[])new Object[INITIAL_CAPACITY];
	}
	StackEx(int capacity)
	{
		arr=(E[])new Object[capacity];
	}

	public void push(E ele)
	{
       arr[indx]=ele;
       indx++;
	}

	public E pop()
	{
		E temp=arr[size()-1];
		arr[size()-1]=null;
		indx--;

		return temp;
	}

	public int size()
	{
		return indx;
	}

	public boolean isEmpty()
	{
		return indx==0;
	}

	public int search(E key)
	{
       for(int i=size()-1,offset=0;i>=0;i--,offset++)
       {
       	if(key == arr[i])
       		return offset;
       } 
       return -1;
    }

	public String toString()
	{
		String data="[";

		for(int i=0;i<size()-1;i++)
		{
			data+=arr[i]+", ";
		}
		data+=arr[size()-1]+"]";

		return data;
	}

	public E peek()
	{
		return arr[size()-1];
	}
}

class StackExDriver
{
	public static void main(String[] args) {

		StackEx<Integer> stack=new StackEx<>();
		System.out.println(stack.isEmpty());

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack);

		stack.pop();

		System.out.println(stack);

		System.out.println(stack.isEmpty());

		System.out.println(stack.search(10));

		System.out.println(stack.peek());

		
	}
}