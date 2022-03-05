class Test{
	/*
	 * String s="29.09"; Integer a=new Integer(10);//int a=10; Float f=new
	 * Float(90.90f);
	 */
	static Double d=70.90;
	void m1() {
		System.out.println(d);
	}
	static void m2() {
		System.out.println(d);
	}
}
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="29";
		Integer a=new  Integer(10);//int a=10;
		Float f=new Float(90.90f);
		Double d=new Double(67.90);
		//or
		Double dt=89.90;
		int i=Integer.parseInt(s);
		float fi=Float.parseFloat(s);
		Double di=Double.parseDouble(s);
		System.out.println(i+" "+fi+""+di);
		char ch='A';
		int as=(int)ch;
		System.out.println(as);
	}

}
