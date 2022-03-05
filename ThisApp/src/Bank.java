
public class Bank {

	private String bankName,area,phoneNumber;

	public Bank(String bankName, String area, String phoneNumber) {
		super();
		this.bankName = bankName;
		this.area = area;
		this.phoneNumber = phoneNumber;
	}
	void displayBankDetails() {
		System.out.println("Bank Name:"+bankName);
		System.out.println("Bank area:"+area);
		System.out.println("Bank contact number:"+phoneNumber);
		
	}
	
	public static void main(String[] args) {
		Bank bank=new Bank("SBI", "Pune", "7262028776");
		bank.displayBankDetails();
	}
}
