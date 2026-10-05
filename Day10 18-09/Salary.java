class Salary
{
   
	private int empSalary = 100000;
	public static void main(String args[])
	{
		Salary sal = new Salary();

		Employee emp = new Employee();
		emp.empId();
		String empName = "chandan";
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Salary : "+ sal.empSalary);
	
	
	
	}
}