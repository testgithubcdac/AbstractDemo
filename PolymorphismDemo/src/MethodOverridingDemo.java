class Loan{
	 double calculateEMI(double principal) {
		return 2000;
	}
	
}
class HomeLoan extends Loan{
	public double calculateEMI(double principal) {
		return 20000;
	}
}
class VehicleLoan extends Loan{
	public double calculateEMI(double principal) {
		return 50000;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loan loan=new HomeLoan();
 double amt=loan.calculateEMI(9000);
 Loan loanv=new VehicleLoan();
 System.out.println();
	}

}
