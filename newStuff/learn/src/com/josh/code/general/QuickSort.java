/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int[] ar = new int[10];
		
		 int[] ar = {2,10,4,5,3,8,6,1,12,7};
		
		System.out.println("Before ");
		for (int i : ar) {
			System.out.print(i +" ");
		}
		
		new QuickSort().sort(ar);
		
		System.out.println("After ");
		
		for (int i : ar) {
			System.out.print(i +" ");
		}
			

	}
	
	private void sort(int[] a){
		
		 quickSort(a, 0, a.length-1);
	}
	
	private void quickSort(int[] b, int first, int last){
		
		int i = first;
		int j = last; 
		
		int pivot = first + (last-first)/2;
		
		
		while(i <=j){
			while(b[i]< b[pivot] ){
				i++;
			}
			while(b[j] > b[pivot]){
				j--;
			}
			
			// swap elements
			if(i<=j){
				swapElements(b, i, j);
				i++;
				j--;
			}
			if(first < j){
				quickSort(b, first, j);
			}
			if(i<last){
				quickSort(b, i, last);
			}
			
			
		}
		
	}
	
	
	public void swapElements(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	

}
