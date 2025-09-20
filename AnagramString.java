class AnagramString
{
	public static void main(String[] args) {
		String str1="listen";
		String str2="stealin";

		if(isAnagram(str1,str2))
		{
			System.out.println(" is anagram");
		}
		else{
			System.out.println(" is not anagram");
		}
	}

	public static boolean isAnagram(String str1,String str2)
	{
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();

		bubbleSort(ch1);
		bubbleSort(ch2);

		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}

		return true;

	}

	public static void bubbleSort(char [] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
			}
		}
	}
}