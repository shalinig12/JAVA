class NewHouse{
	public static void main(String[] args){
		System.out.println(House.housename);
		System.out.println(House.streetname);
		System.out.println(House.rooms);
		System.out.println(House.rating);
		
		House.housename="nikitha";
		House.streetname="ride";
		House.rooms=8;
		House.rating=5.6f;
		
		System.out.println(House.housename);
		System.out.println(House.streetname);
		System.out.println(House.rooms);
		System.out.println(House.rating);
		
	}
}