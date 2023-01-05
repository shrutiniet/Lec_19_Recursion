package Lec_19;
import java.util.*;
public class Seats_Com_wrt_seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		int seats=sc.nextInt();
		int queens=sc.nextInt();
		Seats(seats,0,queens,"");

	}
public static void Seats(int total_seats, int curr, int queens, String path)
{
	if(queens==0)
	{
		System.out.println(path);
		return;
	}
	if(curr==total_seats)
		return;
	Seats(total_seats,curr+1,queens-1,path+"q"+curr);
	Seats(total_seats,curr+1,queens,path);
}
}
