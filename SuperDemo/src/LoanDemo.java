 class Loan {
	int tenuer;
	float interestRate;
	
	public Loan(int tenuer, float interestRate) {
		this.tenuer = tenuer;
		this.interestRate = interestRate;
		
	}

	public  double CalculateEMI(double principal) {
		double simpleInterestRate=(principal*interestRate*tenuer)/100;
		double emi=(simpleInterestRate+principal)/tenuer;
		return emi;
	}
}
class HomeLoan extends Loan{
	
	 HomeLoan() {
		// TODO Auto-generated constructor stub
		 super(5, 7.2f);
		
		
	}
	 public double CalculateEMI(double principal) {
			double simpleInterestRate=(principal*interestRate*tenuer)/100;
			double emi=(simpleInterestRate+principal)/tenuer;
			int processingFees=200;
			return emi+processingFees;
		}
}
/*
 * class GoldLoan extends Loan{ public GoldLoan() { // TODO Auto-generated
 * constructor stub tenuer=1; interestRate=18.0f; } } class VechicleLoan extends
 * Loan{ public VechicleLoan() { // TODO Auto-generated constructor stub
 * tenuer=3; interestRate=10.0f; } }
 */

public class LoanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomeLoan homeLoan=new HomeLoan();
		double amount=homeLoan.CalculateEMI(2000000);
		System.out.println("Home Loan emi per Year:"+amount);
		/*
		 * GoldLoan goldLoan=new GoldLoan(); double
		 * gamount=goldLoan.CalculateEMI(200000);
		 * System.out.println("Gold loan emi :"+gamount); VechicleLoan vechicleLoan=new
		 * VechicleLoan(); double amt=vechicleLoan.CalculateEMI(100000);
		 * System.out.println("vechicle loan emi:"+amt);
		 */
	}

}
