package Learning;

public class Bicycle {
	int wheel=2;
	String seat;
	public void riding() {
		System.out.println("Bicycle is for riding");
	}
	public class RoadBicycle extends Bicycle{
		public void riding() {
			
				System.out.println("RoadBicylce is for riding");
		}}
		public class TestBicycle{
		
			public  void main(String[] args) {
				 RoadBicycle b =new  RoadBicycle();
		b.riding();
		
			}
		}
		
	}


