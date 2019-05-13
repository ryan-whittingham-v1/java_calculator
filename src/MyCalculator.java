public class MyCalculator {

	private double numA; // First number 
	private boolean numAflag; // if first number is present
	private double numB; // if second number is present
	private double answer;
	private String numString = "";
	private boolean numMode; // Flag for handling number input
	private String operator = ""; // math operations +, -, *, /
	private boolean equalMode = false; // flag for constant calculations
	private boolean numBflag;

	// Constructor
	public MyCalculator() {
		this.clear();
	}
	
	public String getNum() {
		return numString;
	}
	
	// Capturing number input
	public void setNum(String x) {
		if(numMode) { // If already in number mode...
			numString = numString + x; // ...continue building the current number
		}
		else { // Calculator was in operator mode, user wants to start new number
			numMode = true; // Go into number mode
			numString = x; // Start a new number
		}
		if(numString.charAt(0) == '0') {// If number starts with zero...
			numString = "0"; // ...display zero only
		}
		//Assign the number to an appropriate variable

			if (numAflag) { // If numA already exists
				numB = Double.parseDouble(numString); // Assign the new number to numB (second number)
				numBflag = true;
			}
			else { // numA (first number) is not set
				numA = Double.parseDouble(numString); // Assign the number to numA
			}
			System.out.println("numA:" + numA + " numB:" + numB);
	}
	
	// Run calculation
	public void calculate() {
		if((numAflag && numBflag) || equalMode) { // If numA and numB are present or in equal mode run operation
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
				if(numB == 0) { // Check for division by zero
				
				}
				else {
					answer = numA / numB;
				}
			}
			numBflag=false;
		}
		// Operator key pressed but second number (numB) has not been set yet
		else {
			numAflag = true; // Signify first number is now present
			// If valid single number operation 
			if(operator == "sq") {
				numB = numA;
				answer = numA * numB;
				operator = ""; // Prevent calculating again if different operator key pressed
			}
			else {
				answer = numA;
			}
		}
		// Set appropriate values all scenarios
		System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
		numMode = false; // Signify that no longer in number mode to allow new number input if desired;		
		numA = answer; // Update numA for potential continuation of calculations
	}
			
	public void clear() {
		numA = 0;
		numAflag = false;
		numBflag = false;
		numB = 0;
		numMode = true;
		equalMode = false;
		numString = "";
		answer = 0;
		operator = "";
		System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer);
	}
	
	public void setOperator(String text) {
		operator = text;
	}
	
	public void setEqualMode(boolean x) {
		equalMode = x;
	}
	
	public String getAnswer() {
		return Double.toString(answer);
	}
	
	
}
