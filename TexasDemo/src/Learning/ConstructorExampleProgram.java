package Learning;

public class ConstructorExampleProgram {
	int employee_age;
	String employee_name;
	int employee_salary;
	//Default constructor
	ConstructorExampleProgram(){
		this.employee_name="Bob";
		this.employee_age=30;
		this.employee_salary=7000;}
	//Parameterize  constructor
	ConstructorExampleProgram(String n, int a, int b){
		this.employee_name=n;
		this.employee_age=a;
		this.employee_salary=b;
	}
	public static void main (String[]args) {
		ConstructorExampleProgram obj1= new ConstructorExampleProgram();
		ConstructorExampleProgram obj2= new ConstructorExampleProgram("Rajan",43,5000);
		System.out.println(obj1.employee_name+ " "+obj1.employee_age+" "+ obj1.employee_salary);
		System.out.println("***********");
		System.out.println(obj2.employee_name+" " +obj2.employee_age+" " +obj2.employee_salary);
	}

	

}
