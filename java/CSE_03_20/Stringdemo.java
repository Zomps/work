import java.lang.*;
class Stringdemo
{	
	public static void main(String args[])
	{
		String str1=new String("my name is Mamik das");
		String str2=new String(" i read in HETC.");
		String str3=new String("MY NAME IS MAMIK DAS");
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.concat(str3));
		System.out.println(str2.substring(2,5));
	}
}
