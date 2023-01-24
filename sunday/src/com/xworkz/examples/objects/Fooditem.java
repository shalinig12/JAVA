package com.xworkz.examples.objects;

public class Fooditem {

	public static String[] ingrdntsName(String fooditem,String[] ingrdnts) {
		if(fooditem=="Idli")
		{
			for(int seq=0;seq<ingrdnts.length;seq++)
			{
				String ingrdntsName=ingrdnts[seq];
			
				System.out.println("ingrdnt :"+ingrdntsName);
			}
			return ingrdnts;
		}
		return null;
	

	}

}
