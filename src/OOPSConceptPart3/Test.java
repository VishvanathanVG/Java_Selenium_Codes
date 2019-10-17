package OOPSConceptPart3;

public class Test extends Shape{

	Test(){
		System.out.println("Test class constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape s=new Test();
     s.drawing();
     s.writing();
		
		//in abstract 0-100% abstraction only..partial obstraction
     
     
     Test t=new Test();
	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		
	}
	


}
