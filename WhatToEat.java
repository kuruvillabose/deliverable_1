package artwork;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		
		Scanner scnr=new Scanner(System.in);
		String[] eventType= {"Casual","Semi-formal","Formal"};
		System.out.println("Please enter one of the following event Types: Casual,Semi-formal,Formal :");
		String eventInput=scnr.next();
		
		System.out.println("Enter the Party size (Any number from 1)");
		int partySize = scnr.nextInt();
		
		String [] mealSuggestion= {"Sandwiches","Fried Chicken","Chicken parmesan"};
		String []prepSuggestion= {"in the Microwave","in your Kitchen","by a Caterer"};
		String mSuggestion = null;
		String pSuggestion=null;
		
		//first condition
		if(eventInput.equals(eventType[0]) && partySize==1)
		{
			mSuggestion=mealSuggestion[0];
			pSuggestion=prepSuggestion[0];
		}
		else if(eventInput.equals(eventType[0]) && partySize >1 && partySize<=12)
		{
			mSuggestion=mealSuggestion[0];
			pSuggestion=prepSuggestion[1];
		}
		else if(eventInput.equals(eventType[0]) && partySize>12)
		{
			mSuggestion=mealSuggestion[0];
			pSuggestion=prepSuggestion[2];
		}
		//second condition
		if(eventInput.equals(eventType[1]) && partySize==1)
		{
			mSuggestion=mealSuggestion[1];
			pSuggestion=prepSuggestion[0];
		}
		else if(eventInput.equals(eventType[1])&& partySize >1 && partySize<=12)
		{
			mSuggestion=mealSuggestion[1];
			pSuggestion=prepSuggestion[1];
		}
		else if(eventInput.equals(eventType[1]) && partySize>12)
		{
			mSuggestion=mealSuggestion[1];
			pSuggestion=prepSuggestion[2];
		}
		//Third condition
		if(eventInput.equals(eventType[2]) && partySize==1)
		{
			mSuggestion=mealSuggestion[2];
			pSuggestion=prepSuggestion[0];
		}
		else if(eventInput.equals(eventType[2]) && partySize >1 && partySize<=12)
		{
			mSuggestion=mealSuggestion[2];
			pSuggestion=prepSuggestion[1];
		}
		else if(eventInput.equals(eventType[2]) && partySize>12)
		{
			mSuggestion=mealSuggestion[2];
			pSuggestion=prepSuggestion[2];
		}
		
		
		String result="Since you're hosting a "+eventInput+" event for "+partySize + " participants you should serve  "+ mSuggestion+ " prepared "+ pSuggestion +" . " ;
		System.out.println(result);	
		scnr.close();
	}	
		
		
}

