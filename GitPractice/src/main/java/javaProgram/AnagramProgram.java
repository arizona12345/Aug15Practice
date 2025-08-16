package javaProgram;

public class AnagramProgram {
	
	public static void main(String[] args) {
		String string1 = "Debit Card";
		String string2 = "Bad credit";
		String newStr1 = sorting(string1.trim().replaceAll("//s", "").toLowerCase().toCharArray());
		String newStr2 = sorting(string2.trim().replaceAll("//s", "").toLowerCase().toCharArray());
		System.out.println(newStr1);
		System.out.println(newStr2);
		if(newStr1.equals(newStr2))
		{
			System.out.println("Given 2 strings are Anagram");
		} else 
		{ 
			System.out.println("Given 2 strings are not anagram");
		}
	}
	public static String sorting(char[] array)
	{
		int length = array.length;
		for(int i=0;i<=length-1;i++)
		{
			for(int j=0;j<=length-2;j++)
			{
				if(array[j] > array[j+1])
					{
					char temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					}
		}
	} return new String(array);

}}
