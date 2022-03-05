import java.time.LocalDate;

class SBIBank{
	/*
	 * by using netBanking 
	 * by using cheque banking 
	 * by using DD banking
	 */
	public void fundTransfer(int senderAccNo,int reciverAccNo,double amt) {
		System.out.println(" User transfer amount using netBankig");
		System.out.println("Sender Acc No.:"+senderAccNo);
		System.out.println("Reciver Acc No.:"+reciverAccNo);
		System.out.println("Transfer Amount:"+amt);
		System.out.println("Fund transfer Successfully using netBanking....");
	}
	public void fundTransfer(int chequeNo,double amt) {
		System.out.println(" User transfer amount using cheque");
		System.out.println("Cheque No.:"+chequeNo);
		System.out.println("Transfer Amount:"+amt);
		System.out.println("Fund transfer Successfully using cheque ....");
	}
	public void fundTransfer(int ddNo,double amt,LocalDate ld) {
		System.out.println(" User transfer amount using DD");
		System.out.println("Cheque No.:"+ddNo);
		System.out.println("Transfer Amount:"+amt);
		System.out.println("Date.:"+ld.now());
		System.out.println("Transfer Amount:"+amt);
		System.out.println("Fund transfer Successfully using DD ....");
	}
}
public class FundTransferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBIBank sbiBank=new SBIBank();
sbiBank.fundTransfer(100126,67000.90,LocalDate.now());
	}

}
