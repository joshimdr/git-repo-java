package com.josh.code.general;

public class StringCompression {

	
	
	
	
	public static void main(String[] args) {
		
		char[] charArr = new String("faabbbbbccccccddee").toCharArray();
		//char[] charArr = new String("faee").toCharArray();
		char[] compressed = new StringCompression().compressString(charArr);
		for (int i = 0; i < compressed.length; i++) {
			System.out.print(compressed[i]);
		}
	}

	private char[] compressString(char[] charArr) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<charArr.length-1;i++){
			
			int charCount = 1;
			while(i<charArr.length-1 && charArr[i] == charArr[i+1] ){
				charCount=charCount+1;
				i++;
				
			}
			sb.append(charArr[i]);
			sb.append(charCount);
			
			
		}
		
		return sb.toString().toCharArray();
	}
	
	
}
