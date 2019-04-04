package zoe_pare_exercise1;

public class BasePlusCommissionEmployee {

//instance variables
	private int employeeId;
	private String firstName;
	private String lastName;
	private double baseSalary = 200;
	private double grossSales;
	private double commissionRate =0.1;
	
//Getters Only
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public double getBaseSalary() {
//Base Salary default value already set to 200.00
		return baseSalary;
	}
	
//Getters and Setters
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getCommissionRate() {
//Commission Rate default value set to 0.1
		return commissionRate;
	}
	
	public void setGrossSalary(double grossSales) {
		if (grossSales <= 0) {
			this.grossSales = grossSales;
			
		}
		else {System.out.print("Error! Amount Less Than Zero!");
		this.grossSales = 1;}
	}
	
	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0.1 && commissionRate <= 1.0) {
			this.commissionRate = commissionRate;	
		}
		else {
		System.out.print("Error! Incorrect Commission Rate");}
	}
	
//Constructors
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName,
			double baseSalary, double grossSales, double commissionRate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseSalary = baseSalary;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
//Methods
	public void doubleEarnings(double employeeCommission) {
		employeeCommission = (commissionRate * grossSales + baseSalary);
		System.out.println("Employee's Commission is: " + employeeCommission);
	}
	
	public void StringtoString() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Salary: " + baseSalary);
		System.out.println("Commission Rate: " + commissionRate);
		System.out.println(" ");
	}
}
