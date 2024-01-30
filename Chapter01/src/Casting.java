
public class Casting {

	public static void main(String[] args) {
		
		char charvalue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;

		intValue = 74;
		charvalue = (char) intValue;
		System.out.println(charvalue);
		
		longValue = 500;
		doubleValue = 3.14;
		
		//long -> int
		intValue = (int)longValue;
		
		//double-> float
		floatValue = (float)doubleValue;
		
		System.out.println(intValue);
		System.out.println(floatValue);
			
	}

}
