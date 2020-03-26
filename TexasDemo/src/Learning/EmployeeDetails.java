package Learning;

public abstract class EmployeeDetails {
	private String name;
	private int emp_ID;
	
	public void commonEmpDetails()
	{
		System.out.println("name"+ name);
		System.out.println("emp_ID"+ emp_ID );
	}
			public abstract void confidentialsDetails(int s, String p);
		
		
	}


