/**
 * 
 */
package com.josh.code.general2;

/**
 * @author Munish
 *
 */
public class StringToNumber {

	/**
	 * 
	 */
	public StringToNumber() {
		// TODO Auto-generated constructor stub
	}

	public static int myAtoi(String str) {
		
		int ten = 10;
		String signChar = "";
		if (str == null || str.length()<1) {
			return 0;
		}
		if (str.length() == 1) {
			int r =Character.getNumericValue(str.charAt(0)); 
			if(r<0){
				return 0;
			}
		}
		
		str = str.trim();
		
		int number =0;
		int startIndex = 0;
		
		if(str.charAt(0) == '+' || str.charAt(0) == '-'){
			signChar = String.valueOf(str.charAt(0));
			
			number = Character.getNumericValue(str.charAt(1));
			
			if(str.length()==2){
				if(str.charAt(0) == '-' ){
					return -number;
				}else{
					return number;
				}
				
			}
			
			startIndex=2;
		}else{
			number = Character.getNumericValue(str.charAt(0));
			startIndex=1;
		}
		

		if (str.length() > 1) {
			for (int i = startIndex; i < str.length(); i++) {

				int digit = Character.getNumericValue(str.charAt(i));
				if(number==-1){
					return 0;
				}

				number = number * ten + digit;

			}
		}
		
		
		
		return (str.charAt(0) == '-')?-number:number;
	}

	public static void main(String[] args) {

		System.out.println(myAtoi("123"));
		System.out.println(myAtoi("1"));
		System.out.println(myAtoi(null));
		System.out.println(myAtoi("+"));
		System.out.println(myAtoi("-1"));
		System.out.println(myAtoi("-123"));
		
		/*System.out.println(myAtoi("+-2"));
		System.out.println(myAtoi("+-"));
		System.out.println(myAtoi("    010"));
		*/
		

	}

}
