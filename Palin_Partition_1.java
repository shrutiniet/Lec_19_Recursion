package Lec_19;
import java.util.*;
public class Palin_Partition_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Palin(str,"");

	}
public static void Palin(String str, String path)
{
	if(str.isEmpty())
	{
		System.out.println(path);
		return;
	}
	for(int cut=1;cut<=str.length();cut++)
	{
	String piece=str.substring(0,cut);
	if(isPalin(piece))
	{
		String rem=str.substring(cut);
		Palin(rem,path+piece+"||");
	}
	}
}
public static boolean isPalin(String str)
{
	int s=0;
	int e=str.length()-1;
	while(s<e)
	{
		if(str.charAt(s)!=str.charAt(e))
			return false;
		s++;
		e--;
	}
	return true;
}
}
