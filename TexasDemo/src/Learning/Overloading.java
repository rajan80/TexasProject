package Learning;

public class Overloading {
	public int sub(int a, int b)
	{
		int rs= a-b;
		return rs;
		
	}
	public int add(int a, int b)
	{
		int rs1= a+b;
		return rs1;
	}
		
	public static void main (String[]args) {
		Overloading ov= new Overloading();
		System.out.println(ov.sub(20, 10));
		System.out.println("****");
		System.out.println(ov.add(20, 30));
	}

}
