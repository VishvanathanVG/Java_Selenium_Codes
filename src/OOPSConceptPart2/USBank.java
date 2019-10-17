package OOPSConceptPart2;

public interface USBank {

	int min_bal=100;//cannot be changed since it is static vars
	
	/*In Interface we cannot create method body and can define only method
	cannot create static method
	can be declare only static variable
	we cannot create object of interface
	*/
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
}
