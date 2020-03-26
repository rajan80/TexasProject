package Learning;

public class HR extends EmployeeDetails{
	private int salary;
	private String performance;
	@Override
	public void confidentialsDetails( int s, String p) {
		this.salary =s;
		this.performance =p;
		//System.out.println("salary==="+salary);
		System.out.println("performance==="+ performance);
		System.out.println("salary==="+salary);
		}
	public static void main(String[] args) {
		HR hr= new HR();
		hr.confidentialsDetails(5000, "Rajan");
		
		
	}
}
	
		
		
	



