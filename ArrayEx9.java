import java.util.*;

class ArrayEx9
{
	public static void main(String[] args) {
		int arr[]={10,20,30,10,40,20,10,50,60,70,10};

		ArrayList<Integer> list=new ArrayList<>();
		for(int ele : arr)
		{
			list.add(ele);
		}

		Set<Integer>set=new LinkedHashSet<>();

		Map<Integer,Integer> map=new LinkedHashMap<>();

		for(Integer ele : list)
		{
			int cnt=Collections.frequency(list,ele);
			map.put(ele,cnt);

		}

		System.out.println(map);


	}
}