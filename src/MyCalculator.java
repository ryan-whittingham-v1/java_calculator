public class MyCalculator {

	private int numA; // First number 
	private boolean numAflag; // if first number is present
	private int numB; // if second number is present
	private int answer;
	private String numString = "";
	//private boolean numMode; // Flag for handling number input
	private String operator = ""; // math operations +, -, *, /
	//private boolean equalMode; // flag for constant calculations
	private boolean numBflag;
	//private boolean Mode;
	private double numAdouble;
	private double numBdouble;
	private double answerDouble;
	private boolean decimalPresent;
	private String lastKey = "";
	private int prevAnswer;
	private double prevAnswerDouble;
	private boolean decimalFlag; 
	private boolean valuesCalculated;
	

	// Constructor
	public MyCalculator() {
		this.clear(); // Init values
	}
	
	public String getNum() {
		return numString;
	}
	
	// Capturing number input
	public void setNumString(String x) {
		if(lastKey == "equalKey") {
			this.clear();
		}
		valuesCalculated = false; // Signify calculation has not been made with this number
		if(lastKey != "numKey") { // If starting a new number
			decimalFlag = false; // Reset decimal flag
			if(x == "."){ // Decimal key detection at beginning of number 
				x = "0."; // Add 0 before decimal to avoid parseDouble exception
				decimalPresent = true; // Signify number is type double for proper answer return
				decimalFlag = true; // Signify number contains decimal to prevent multiple "." in number
			}
			numString = x; // Assign x to start of new number
		}
		else if(lastKey == "numKey") { // Continue typing in number
			if(x == ".") { // Decimal point detection
				if(!decimalFlag) { // If decimal not already present in the number
					numString = numString + x;
					decimalPresent = true; // Signify number is type double for proper answer return
					decimalFlag = true; // Signify number contains decimal to prevent multiple "." in number
				}
			}
			else if((numString.charAt(0) == '0') && (x == "0" && !decimalPresent)) { // Duplicate zero detection at start of number
					numString = x;
			}
			else { 
				numString = numString + x; // Add x to end new number
			}
		}
	}
	
	//Assign the number to an appropriate variable
	private void setNum() {
		if (numAflag) { // If numA (first number) already exists
			if(!decimalPresent) { // If no decimal in number
				numB = Integer.parseInt(numString); // Set number to numB type int
			}
 			numBdouble = Double.parseDouble(numString); // Set number to numB type double
			numBflag = true; // Signify numB is set
		}
		else { // numA is not set (non number key not yet pressed)
			if(!decimalPresent) { // If no decimal in number
				numA = Integer.parseInt(numString); // Set number to numA type int
			}
			numAdouble = Double.parseDouble(numString); // Set number to numA type double
			numAflag = true;
		}
		System.out.println("setNum method");
		System.out.println("numAint:" + numA + " <" + operator + ">" + " numBint:" + numB + " = " + answer + " | lastkey: " + lastKey);
		System.out.println("numAdbl:" + numAdouble + " <" + operator + ">" + " numBdbl:" + numBdouble + " = " + answerDouble + " | lastkey: " + lastKey);
	}
	
	// Run calculation
	public void calculate() {

		if(!numBflag) { // If numB is not set...
			answer = numA; // ...temporarily store numA in the answer
			answerDouble = numAdouble;
		}
		if(numAflag && numBflag) { // If numA and numB are present
			
			if(operator == "+") {
				answer = numA + numB;
				answerDouble = numAdouble + numBdouble;
			}
			else if(operator == "-") {
				answer = numA - numB;
				answerDouble = numAdouble - numBdouble;
			}
			else if(operator == "*") {
				answer = numA * numB;
				answerDouble = numAdouble * numBdouble;
			}
			else if(operator == "/") {
				if((numB != 0) && (numBdouble != 0)) {
					if(numA%numB == 0){
						answer = numA / numB;
					}
					else{
						decimalPresent = true; // flag decimal is present
						answerDouble = numAdouble / numBdouble;
					}
				}
			}
			numA = answer; // Store answer in numA int for continued calculations
			numAdouble = answerDouble; // Store answer in numA double for continued calculations
			numBflag = false; // Allow new number to be saved to numB
		}
		valuesCalculated = true; // Signify calculation has been made on current numbers
		System.out.println("numAint:" + numA + " <" + operator + ">" + " numBint:" + numB + " = " + answer + " | lastkey: " + lastKey);
		System.out.println("numAdbl:" + numAdouble + " <" + operator + ">" + " numBdbl:" + numBdouble + " = " + answerDouble + " | lastkey: " + lastKey);
	}
		
	public void clear() {
		numA = 0;
		numAdouble = 0;
		numAflag = false;
		numBflag = false;
		numB = 0;
		numBdouble = 0;
		//numMode = true;
		//equalMode = false;
		numString = "";
		answer = 0;
		answerDouble = 0;
		operator = "";
	//	intMode = true;
		decimalPresent = false;
		lastKey = "";
		decimalFlag = false;
		valuesCalculated = false;
		System.out.println("numA:" + numA + " operator:" + operator + " numB:" + numB + " answer:" + answer + "lastkey:" + lastKey);
	}
	
	public void setOperator(String text) {
		operator = text; // Assign text to operator 
	}
	
	public void updateValues() {
		if(lastKey == "numKey") { // If last key was a number key...
			this.setNum(); // Assign number appropriate variable (should be numA)
		}
		if(!valuesCalculated) {
			this.calculate();
		}
	}
	
	
	public String getAnswer() {
		if(!decimalPresent) {
			return Integer.toString(answer);
		}
		else {
			return Double.toString(answerDouble);
		}
	}
	
	public void setLastKey(String text) {
		lastKey = text;
	}
}
