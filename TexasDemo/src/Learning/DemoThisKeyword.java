package Learning;

public class DemoThisKeyword {
	private int accno;
	private int balance;
	
	public void setvalues(int accno, int balance) {
		this.accno= accno;
		this.balance = balance;
	}
	public int showdata()
	{
	System.out.println(accno);
	System.out.println(balance);
	return balance;}
	public static void main(String[] args) {
	DemoThisKeyword a = new DemoThisKeyword();
	a.setvalues(2, 89);
	a.showdata();
	System.out.println(a.showdata());
	
	}
	

}
	
