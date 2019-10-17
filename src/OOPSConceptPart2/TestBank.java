package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(USBank.min_bal);
		
		
		//Static polymorphism - Compile time poylorphism
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.eduLoan();
		hs.carloan();
		hs.busLoan();
		
		
		//Dynamic polymorphism // child class object can be referred by parent interface referncevar
		USBank us=new HSBCBank();
		us.debit();
		us.credit();
		us.transferMoney();
	
		
	}

}