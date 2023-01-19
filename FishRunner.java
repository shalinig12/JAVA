class FishRunner{
	public static void main(String[] args)
	{
		System.out.println("start fishrunner");
		double priceref=300;
		Fish.sell(priceref);
		
		String fishref="catla";
	String[] ingridientsRef={"fish","salt","lemon"};
	Fish.cook(fishref,ingridientsRef);
	
	int yearref=2019;
	int monthref=10;
	int dateref=6;
	Fish.die(yearref,monthref,dateref);
	System.out.println("end fishrunner");
	}
}