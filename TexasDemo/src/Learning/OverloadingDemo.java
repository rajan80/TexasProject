package Learning;

public class OverloadingDemo {
	
		public int add (int a, int b)
		{
			int rs= a+b;
			return rs;
		}
		public static void main(String[] args) {
			OverloadingDemo  ov =new OverloadingDemo();
			System.out.println(ov.add(20, 30));

	}

}
