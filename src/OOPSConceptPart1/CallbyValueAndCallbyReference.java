package OOPSConceptPart1;

public class CallbyValueAndCallbyReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		CallbyValueAndCallbyReference obj=new CallbyValueAndCallbyReference();
		
		obj.sum(a, b);//call by value 
		obj.p=60;
		obj.q=70;
		
	    obj.swap(obj);		
	    
	    System.out.println(obj.p);
	    System.out.println(obj.q);

	}

	
	public  int  sum(int x , int y) {
		
		int z=x+y;
		
		System.out.println(z);
		return z;
		
		
	}

	//call by object reference variable
	public void swap(CallbyValueAndCallbyReference t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
		
		
	}
	
}
