package com.josh.tryout.conversions;

public class HexAndDecimalConversions {

	public static void main(String[] args) {

		hexToDec("abc");
		decToHex(2748);

	}

	/**
	 * Converting hex to dec
	 * 
	 * @param hex
	 */
	private static void hexToDec(String hex) {

		String hexa = "0123456789abcdef";

		int dec = 0;

		if (hex != null && hex.length() > 0) {
			for (int i = 0; i < hex.length(); i++) {

				char c = hex.charAt(i);

				int index = hexa.indexOf(c);

				dec = dec * 16 + index;

			}
		}

		System.out.println("Dec value:" + dec);

	}

	/**
	 * Converting dec to hex
	 * 
	 * @param decNum
	 */
	private static void decToHex(int decNum) {
		
		
		String hexa = "0123456789abcdef";
		
		String hex = "";
		
		while (decNum>0){
			
			int decBit = decNum%16;
			
			hex = hexa.charAt(decBit)+""+hex;
			
			decNum = decNum/16;
			
			
			
		}
		
		System.out.println("Hex Number:"+hex);
			

	}
	
	

}




