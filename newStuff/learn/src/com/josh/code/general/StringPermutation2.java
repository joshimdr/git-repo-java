/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class StringPermutation2 {
	
	

	public static void permutation(String str) {
		permutation("", str, 0);
	}

	private static void permutation(String prefix, String str, int j) {
		int n = str.length();
		if (n == 0){
			//System.out.println("i="+ii);
			//System.out.println(" j= "+j+ " Combination made="+prefix);
			System.out.println("word formed:"+prefix);
			
		}
		else {
			for (int i = 0; i < n; i++){
				//System.out.println("");
				// System.out.println("in::i="+i+ "     prefix="+prefix + str.charAt(i) +"    remaining="+(str.substring(0, i) + str.substring(i + 1, n)));
				//System.out.println("  ins="+ins++);
				permutation(prefix + str.charAt(i)  ,   str.substring(0, i) + str.substring(i + 1, n),i);
				// System.out.println(" out i= "+i);
				//System.out.println("");
				//System.out.println("         out ::i="+i+ "     prefix="+prefix + str.charAt(i) +"    next="+(str.substring(0, i) + str.substring(i + 1, n)));
			}
		}
		
		// System.out.println("OUT !!!");
		//System.out.println(" **** global_i="+global_i++);
		//System.out.println("final j="+j);
	}
	
	
	public static void main(String[] args) {
		String str = "abc";
		StringPermutation2.permutation(str);
		
	}
	
	

}