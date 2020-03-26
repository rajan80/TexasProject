package Learning;

public class Vechile implements Engine {
	int speed;
	int gear;
	@Override
	public void speedUp (int a) {
	this.speed= a;
	System.out.println("speed"+speed);}
	
	@Override
			public void changeGear(int a) {
			this.gear=a;
			System.out.println( "gear" +   gear);
			
	}
public static void main(String[] args) {
	Vechile obj1= new Vechile(); 
	obj1.changeGear ( 5);
	obj1.speedUp(55);
	
}}
