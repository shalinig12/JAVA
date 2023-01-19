class Fish{
	static void sell(double price)
	{
		System.out.println("start");
		if(price>0)
		{
			return;
		}
		if(price>500 && price<1000)
		{
			System.out.println("i will not buy");
		}
		if(price==80)
		{
			System.out.println("i will buy");
		}
		if(price>80 && price<500)
		{
			System.out.println("i will think");
		}
		if(price>1000)
		{
			System.out.println("i will not eat fish only");
		}
	}
		static void cook(String fish,String[] ingredients){
		
			System.out.println("start sell");
			if(fish==null)
			{
				return;
			}
			if(ingredients==null)
			{
				return;
			}
			for(int seq=0;seq<ingredients.length;seq++)
			{
				System.out.println(ingredients[seq]);
			System.out.println("end cook");
}
		
		}
		static void die(int year,int month,int date)
		{
			System.out.println("start die");
			if(year<=0 || month<=0 || date<=0)
			{
				return;
			}
			else if(year>2023 | year<2020)
			{
				return;
				
				
			}
			else if(month>12)
			{
				return;
			}
			else if(date>31)
			{
				return;
			}
			System.out.println("end die");
			
			}
		
	}
	
}
}
}




