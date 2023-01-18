class CityRunner{
	public static void main(String[] args){
		System.out.println("Main:start");
		System.out.println(City.cityName);
		System.out.println(City.roadLength);
		System.out.println(City.turn);
		
		String CitynameRef=City.cityName;
		int roadlengthRef=City.roadLength;
		long turnRef=City.turn;
		
		City.cityName="bnglr";
		City.roadLength=23;
	    City.turn=88;
		
		System.out.println(City.cityName);
		System.out.println(City.roadLength);
		System.out.println(City.turn);
		
		System.out.println("End:close");
		
		
		
	}
}