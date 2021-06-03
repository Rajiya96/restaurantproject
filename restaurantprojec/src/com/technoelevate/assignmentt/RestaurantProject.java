package com.technoelevate.assignmentt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantProject {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		
		HashMap<String,Double> hm = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter '0'to exit");
		System.out.println("Please enter items names: ");

	      alist.add("pepsi");
	      alist.add("coke");
	      alist.add("fanta");
	      alist.add("sprite");
	      alist.add("dosa");
	      alist.add("idly");
	      
	      hm.put("pepsi", 20.0);
	      hm.put("coke", 30.0);
	      hm.put("fanta", 40.0);
	      hm.put("sprite", 50.0);
	      hm.put("dosa", 20.0);
	      hm.put("idly", 20.0);
	  
	      //create an array and displaying restaurant items 
	      System.out.println("restaurant items"+alist);
	  
	      ////  By use of for loop
	      System.out.println("By use of for loop"); 
	    	for(int i = 0; i < alist.size(); i++) 
	    	{ 
	    		System.out.println(alist.get(i)); 
	    	} 
	    	 
	    	System.out.println("please enter the list of item you want to purchase");
	    	ArrayList<String> res = new ArrayList<String>();
	    	int n = scanner.nextInt();
	    	double total = 0;
	    	
	    	while(n>0 && n < alist.size())
	    	{
	    		int item = scanner.nextInt();
	    		if(item>0 && item < alist.size())
	    		{
	    			res.add(alist.get(item));
	    			total+=hm.get(alist.get(item));
	    		}
	    		else
	    		{
	    			System.out.println("item is not available");
	    			n++;
	    		}
	    		n--;
	    	}
	    	System.out.println("List of item which you are purchased");
	    	System.out.println();
	    	for(String str : res)
	    	{
	    		System.out.print(str+" ");
	    	}
	    	System.out.println();
	    	System.out.println("Total amount is  : "+total);
	    	
	    	System.out.println("Finally get order successful" 
	    			);

	}
	}

