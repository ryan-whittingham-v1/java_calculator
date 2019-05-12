
public class MyCalculator {
	
	
	private double numA;
	private boolean numAflag;
	private boolean numBflag;
	private double numB;
	private double answer;
	private String numString = "";
	private boolean numMode; // numMode
	private String operator = ""; // +, -, *, /
	
	public MyCalculator() {
		numMode = true; // Start calculator in number mode
		numAflag = false;
		numBflag = false;
		
	}
	
	public String getNum() {
		return numString;
	}
	
	public void setNum(String x) {
		//Building the number
		if(numMode) { // If already in number mode
			numString = numString + x; // Continue building current number
		}
		else { // Calculator was in operator mode
			numMode = true; // Set to number mode
			numString = x; // Start a new number string
		}
		//Assigning the number to variables
		if (numAflag) { // If numA has already been set
			numB = Double.parseDouble(numString); // Assign number to numB
			//numBflag = true; // set numB flag to signify second number is set
		}
		else { // This is first number (numA)
			numA = Double.parseDouble(numString); // Assign number to numA
			//numAflag = true; // Set numA flag to signify first number is set
		}
		System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
	}
	
	public String getAnswer() {
		if(numAflag && numMode) { // If first number is set and currently in numMode (numB present)
			numMode = false; // Switch out of number mode
			if(operator == "+") {
				answer = numA + numB;
			}
			else if(operator == "-") {
				answer = numA - numB;
			}
			else if(operator == "*") {
				answer = numA * numB;
			}
			else if(operator == "/") {
				answer = numA / numB;
			}
			System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
			numA = answer; // Update numA to store answer for continued calculations
			return Double.toString(answer);
			
		}
		else { // second number (numB) has not been set yet
			numAflag = true;
			numMode = false;
			System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
			return Double.toString(numA); 
		}
	}
			
	public void clear() {
		numA = 0;
		numAflag = false;
		numBflag = false;
		numB = 0;
		numMode = true;
		numString = "";
		answer = 0;
		operator = "";
		System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
	}
	
	public void setOperator(String text) {
		operator = text;
	}
	
}
