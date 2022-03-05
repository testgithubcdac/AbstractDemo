abstract class Branch{
	public abstract boolean validatePhotoProof(String proof);
	public abstract boolean validateAddressProof(String address);
	public void openAccount(String photoProof,String addressProof,int amount) {
		if(amount>1000) {
			if(validatePhotoProof(photoProof)&&validateAddressProof(addressProof)) {
				System.out.println("Account Opened...");
			}
			else {
				System.out.println("(Your address or photo proof is invalid) cannot open Account...");
			}
		}
		else {
			System.out.println("(Your minimum balance is lessthan 1000 ) cannot open Account...");
		}
		
	}
}
class MumbaiBranch extends Branch{

	@Override
	public boolean validatePhotoProof(String proof) {
		// TODO Auto-generated method stub
		if(proof.equalsIgnoreCase("pan card"))
		return true;
		else
			return false;
	}

	@Override
	public boolean validateAddressProof(String address) {
		// TODO Auto-generated method stub
		if(address.equalsIgnoreCase("ration card"))
			return true;
		else
		return false;
	}
	
}
class PuneBranch extends Branch{

	@Override
	public boolean validatePhotoProof(String proof) {
		// TODO Auto-generated method stub
		if(proof.equalsIgnoreCase("Addhar card"))
		return true;
		else
			return false;
	}

	@Override
	public boolean validateAddressProof(String address) {
		// TODO Auto-generated method stub
		if(address.equalsIgnoreCase("ration card"))
			return true;
		else
		return false;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Branch branch=new MumbaiBranch();
branch.openAccount("pan card", "ration card", 2000);
Branch puneBranch=new PuneBranch();
puneBranch.openAccount("Addhar card", "ration card", 1001);
	}

}
