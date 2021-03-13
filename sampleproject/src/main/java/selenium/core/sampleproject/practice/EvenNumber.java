package selenium.core.sampleproject.practice;

import java.util.Scanner;

public class EvenNumber 
{
	public static void main(String[] args) 
	{
	int j=0;	
	for(int i =0;i<=100;i++)
	{
		if(i%2==0)
		{
			j=j+i;
			
		}
		
	}
	System.out.println(j);
}	

}