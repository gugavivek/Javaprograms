

public class CountOfDuplicates {

	public static void main(String[] args)
	{
		DuplicateCount("gugs");
	}
public static int[] DuplicateCount(String name)
{
	int[]arr=new int[26];

	for(int i=0;i<name.length();i++)
	{
	int index = name.charAt(i)-'a';
	arr[index]++;

System.out.println(name.charAt(i)+"="+ arr[index]++);	

	}

	return arr;
}
	
	
}
