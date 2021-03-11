package selenium.core.sampleproject;

import java.util.Scanner;

public class TheatreCounter 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the show count in your theatre");
	int showcount=s.nextInt();
	
	System.out.println("*******Thanks for entering the show count*******");
	System.out.println("Please Enter the tickets you want");
	int tickets=s.nextInt();
	for (int show=1;show<=showcount;show++)
	{
		int ticketavailable=50;
		if(tickets<=ticketavailable)
		{
			ticketavailable-=tickets;
			System.out.println("Your "+tickets+ "has been booked");
		}
		else
		{
			System.out.println(tickets +"is not available in our theatre");
		}
		
	}
	
	
	
	s.close();
	
	
	
	 
 }
}
