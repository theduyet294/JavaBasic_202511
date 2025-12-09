import day2.DecisionMaking;

public class Main {

	public static void main(String[] args) {
	DecisionMaking decisionMaking = new DecisionMaking();
//	decisionMaking.checkNumber(10);
//	
//	if(decisionMaking.checkNumber1(10)) {
//		System.out.println("n là số chẵn");
//	}
//	decisionMaking.checkNumber2(22);
	int n = 565;
	System.out.println("Input an integer between 0 and 1000: "+ n);
	 	System.out.println("The sum of all digits in "+ n+ " is " + decisionMaking.tinhTong(n));
	}

}
