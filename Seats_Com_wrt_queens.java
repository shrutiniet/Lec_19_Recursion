package Lec_19;
import java.util.*;
public class Seats_Com_wrt_queens {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int seats=sc.nextInt();
		int queens=sc.nextInt();
		Seat(seats,-1,queens,"");

	}
public static void Seat(int total_seats, int prev_seat, int queens, String path)
{
	if(queens==0)
	{
		System.out.println(path);
		return;
	}
	for(int curr=prev_seat+1;curr<total_seats;curr++)
	{
		Seat(total_seats,curr,queens-1,path+"q"+curr);
	}
}
}
