import java.util.*;

class ArrayEx4
{
	public static void main(String[] args) {
		int [] arr={10,40,10,2,60,30,90,50};

		Set<Integer> set=new LinkedHashSet<>();
		for(int ele : arr)
		{
			set.add(ele);
		}

		System.out.println(set);
	}
}