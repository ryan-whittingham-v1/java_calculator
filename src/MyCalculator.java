
public class MyCalculator {
	
	private String num="";
	private double result = 0;
	private String mode = "";
	
	public void setNum(String x) {
		num = num + x;
		System.out.println("num="+num);
	}
	
	public void endNum() {
		result = Double.parseDouble(num);
		System.out.println("result="+result);
		num = "";
	}
	
	public String equals() {
		if(mode.equals("+")) {
			System.out.println(result +"+"+num +"=...");
			result = result + Double.parseDouble(num);
			System.out.println(result);
		}
		return Double.toString(result);
	}
	
	public void setMode(String text) {
		mode = text;
		System.out.println("mode="+mode);
	}
	
	public String getNum() {
		return num;
	}
	
	public String getResult() {
		return Double.toString(result);
	}
	
	public void clear() {
		result = 0;
		num = "";
		mode = "";
	}
	
}
