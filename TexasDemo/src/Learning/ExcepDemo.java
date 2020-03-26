package Learning;

public class ExcepDemo {

	public static void main(String[] args) {
		int i=5;
		int j=0;
		try {
		System.out.println(i/j);
		}
		catch(ArithmeticException ae) {
			System.out.println("Wrong input");
		}
		System.out.println("Statement after division");
		
	}
      
	}

