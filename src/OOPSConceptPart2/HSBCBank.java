package OOPSConceptPart2;

public class HSBCBank implements USBank , BrazilBank{//achieving multiple interface 
	//is called Is a relationship - class to interface relationship - implements keyword
	//has relationship - class to class relationship - extends keyword
	
	//Override method from USBank interface
	//If a class inplements by any interface , its mandatory to define all methods of interface
	public void credit() {
		
		System.out.println("HSBC -- Credit");
	}
	
	public void debit() {
		
		System.out.println("HSBC --- Debit");
	}
	
	public void transferMoney() {
		
		System.out.println("HSBC -- transfermoney");
	}
	
	//HSBC Own method
	public void eduLoan() {
		
		System.out.println("HSBC -- Edu loan'");
	}
	
	public void carloan() {
		
		System.out.println("HSBC --- carloan");
	}
	
	//Brazil bank method override
	
	public void busLoan() {
		
		System.out.println("HSBC -- Bus loan");
	}
}
