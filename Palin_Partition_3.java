package Lec_19;
import java.util.*;
public class Palin_Partition_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		List<List<String>> Big_AL= new ArrayList<>();
		caat(str,"",new ArrayList<String>(),Big_AL);
		System.out.println(Big_AL);
}
public static void caat(String str, String path, List<String> AL,List<List<String>> Big_AL)
{
	if(str.isEmpty())
	{
		List<String> CC =new ArrayList<>(AL);
		Big_AL.add(CC);
	}
	for (int chakku = 1; chakku <= str.length(); chakku++) {
		String piece = str.substring(0, chakku);
		if (isPalin(piece)) {
			String remain = str.substring(chakku);
//		System.out.println(piece+ " - "+remain);
			AL.add(piece);
			caat(remain, path + piece + "||",AL,Big_AL);
			AL.remove(AL.size()-1);
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
