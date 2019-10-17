package JavaBasics;

public class SuperKeywordB extends SuperKeywordA{

	public SuperKeywordB() {
		 super();
		
	}
	
	public SuperKeywordB(int i) {
		super(i);
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordB ob=new SuperKeywordB();
		SuperKeywordB obj1=new SuperKeywordB(10);
	}

}
