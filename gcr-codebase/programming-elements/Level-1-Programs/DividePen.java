
public class DividePen{
	public static void main(String[] args){
		
		int pens=14;
		int students=3;
		int distribution=pens/students;
		int nonDistributed=pens%students;
		
		System.out.println("The Pen Per Student is " + distribution + " and the remaining pen not distributed is " + nonDistributed);
	}
}