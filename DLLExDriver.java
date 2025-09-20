class DLL<E>
{
	Node<E> head;
	Node<E> tail;
	int indx=0;


	class Node<E>
	{
		Node<E> prev;
		Node<E> next;
		E ele;

		Node(Node<E> prev,E ele)
		{
			this.prev=prev;
			this.ele=ele;
		}
	}

	public String toString()
	{
		if(indx==0) return "[]";
		String data="[";
		Node<E> currNode=head;
		for(int i=0;i<size()-1;i++)
		{
           data+=currNode.ele+", ";
           currNode=currNode.next;
		}
		data+=currNode.ele+"]";

		return data;

	}

	public void add(E ele)
	{
		Node<E> newNode=new Node(tail,ele);
		if(indx==0)
		{
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		indx++;
	}

	public void addFirst(E ele)
	{

	}

	public int size()
	{
		return indx;
	}
}

class DLLExDriver
{
	public static void main(String[] args) {

		DLL<Integer> dll=new DLL<>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);

		System.out.println(dll);

		
	}
}