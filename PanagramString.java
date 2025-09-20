class PanagramString
{
	public static void main(String[] args) {
		String str="abcdefgijklmdfffnopqrstuvwxyz";

		if(isPanagram(str))
		{
			System.out.print(" is panagram");
		}
		else{
			System.out.print(" is not panagram");
		}
	}

	public static boolean isPanagram(String str)
	{
		if(str.length()<26) return false;

		for(char ch = 'a';ch<='z';ch++)
		{
			if(str.indexOf(ch) == -1)
				return false;
		}

		return true;
	}
}