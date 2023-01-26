package com.xworkz.examples.boot;

public class Person {

	public static void buy(String mobile, double money)
	{
		System.out.println("start in person");
		System.out.println("mobile:"+mobile);
		System.out.println("money:"+money);
		
	}
	public static void buy(String food, int quantity)
	{
		System.out.println("food:"+food);
		System.out.println("quantity:"+quantity);
	}
	public static void buy(String dress, String shoes, String belt)
	{
		System.out.println("dress:"+dress);
		System.out.println("shoes:"+shoes);
		System.out.println("belt:"+belt);
	}
	public static void buy(String bag, String watch)
	{
		System.out.println("bag:"+bag);
		System.out.println("watch:"+watch);
	}
	
	
	

}
