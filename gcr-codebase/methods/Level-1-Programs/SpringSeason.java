public class SpringSeason
{
	//method
	public boolean checkSeason(int dd, int mm){
		if ( dd>=20 && mm==3 || mm==4 || mm==5 || dd<=20 && mm==6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String [] args)
	{
		int dd = Integer.parseInt(args[0]);
		int mm = Integer.parseInt(args[1]);
		
		SpringSeason obj = new SpringSeason();
		
		if (obj.checkSeason(dd, mm))
		{
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		
	}
}