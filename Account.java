
public class Account {

static int numAccounts = 0;
Account()
{
	numAccounts = numAccounts + 1;
	
}

	public static void main(String[] args) {
		Account ob1 = new Account();
		Account ob2 = new Account();
		Account ob3 = new Account();
		Account ob4 = new Account();
		Account ob5 = new Account();
		
		System.out.println("Number of accounts = " + getNumAccounts());
		
		

	}
	private static int getNumAccounts()
	{
		return numAccounts;
		
	}
}
