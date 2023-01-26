package com.xworkz.examples.boot;

public class Box {

	public static void store(String money) {
		System.out.println("start store in box");
		System.out.println("money:"+money);
	}
		
		public static void store(int bangles) {
			
			System.out.println("bangles:"+bangles);

	}
		public static void store(String powder, String cream)
		{
			System.out.println("powder:"+powder);
			System.out.println("cream:"+cream);
		}
		public static void store(float charger, String mobile)
		{
			System.out.println("charger:"+charger);
			System.out.println("mobile:"+mobile);
		}
		public static void store(int money, String pendrive, String card)
		{
            System.out.println("money:"+money);
            System.out.println("pendrive:"+pendrive);
            System.out.println("card:"+card);
		}

}
