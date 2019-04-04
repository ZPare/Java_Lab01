package zoe_pare_exercise1;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		
	BasePlusCommissionEmployee oneEmployee = new BasePlusCommissionEmployee(701, "John", "Smith");
	oneEmployee.StringtoString();
	
	System.out.println("-------------");
	
	BasePlusCommissionEmployee twoEmployee = new BasePlusCommissionEmployee(702, "Sally", "Smith"
	, 350.00, 300.00, 0.5);
	twoEmployee.doubleEarnings(100.50);
	twoEmployee.StringtoString();

	}

}
