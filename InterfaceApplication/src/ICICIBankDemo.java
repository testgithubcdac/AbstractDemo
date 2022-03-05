interface IBank2_0{
	boolean applayCreditCard(Customer customer);
	
}
interface IBank extends IBank2_0{
	int MONEY=2000;
	String createAccount(Customer customer);
	double issueVechicleLoan(String vechicleType,Customer customer);
	double issueHomeLoan(Customer customer);
	double issueGoldLoan(Customer customer);
}
class MumbaiBranch implements IBank{

	@Override
	public String createAccount(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Cust Id"+customer.getCustId());
		System.out.println("Name"+customer.getName());
		return "Acc123";
	}

	@Override
	public double issueVechicleLoan(String vechicleType, Customer customer) {
		// TODO Auto-generated method stub
		if(vechicleType.equals("bike"))
		return 50000;
		else
			return 500000;
	}

	@Override
	public double issueHomeLoan(Customer customer) {
		// TODO Auto-generated method stub
		return 2000000;
	}

	@Override
	public double issueGoldLoan(Customer customer) {
		// TODO Auto-generated method stub
		return 150000;
	}

	@Override
	public boolean applayCreditCard(Customer customer) {
		// TODO Auto-generated method stub
		//check cbl
		return true;
	}
	
}
public class ICICIBankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IBank bank=new MumbaiBranch();
Customer cust=new Customer();
cust.setCustId("cust1210");
cust.setName("Ajay");
String accNumber=bank.createAccount(cust);
System.out.println("Account numbedr:"+accNumber);
double gLoan=bank.issueGoldLoan(cust);
System.out.println(" Gold Loan Amount is:"+gLoan);
double hLoan=bank.issueHomeLoan(cust);
System.out.println(" Home Loan Amount is:"+hLoan);
double vLoan=bank.issueVechicleLoan("bike", cust);
System.out.println(" Vechicle Loan Amount is:"+vLoan);
IBank2_0 bank1=new MumbaiBranch();
boolean credit=bank1.applayCreditCard(cust);
System.out.println("credit card request..."+credit);


	}

}
