class Faculty{
	float gSal=0;
	float sal=3000;
}
class HRA extends Faculty{
	float hra=300;
}
class DA extends HRA{
	float da=200;
}
class Science extends DA{
	float bonus=2000;
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DA obj=new Science();
Science  da=(Science)obj;
obj.gSal=obj.sal+obj.hra+obj.da+da.bonus;
System.out.println("Total Salary:"+obj.gSal);
System.out.println(obj.toString());
	}

}
