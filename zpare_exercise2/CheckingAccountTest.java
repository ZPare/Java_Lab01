package zoe_pare_exercise2;

public class CheckingAccountTest {

	public static void main(String[] args) {
//One Object
		CheckingAccount oneAccount = new CheckingAccount(202, "John Smith", 50.00);
		oneAccount.StringtoString();
		System.out.println("--------------------");
//Second Object
		CheckingAccount twoAccount = new CheckingAccount(301, "Jane Doe", 100.00);
		twoAccount.StringtoString();
		twoAccount.doubleWithdraw(40.50);

	}

}
