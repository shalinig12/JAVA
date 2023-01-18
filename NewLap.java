class NewLap{
	public static void main(String[] args){
		System.out.println(Lap.brand);
		System.out.println(Lap.price);
		System.out.println(Lap.pixel);
		
		Lap.brand="asus";
		Lap.price=45000;
		Lap.pixel=23.7f;
		
		System.out.println(Lap.brand);
		System.out.println(Lap.price);
		System.out.println(Lap.pixel);
		
	}
}