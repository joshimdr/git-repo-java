package com.josh.tryout.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {

    Set hset = null;
    /** Initialize your data structure here. */
    public RandomizedSet() {
       hset= new HashSet();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hset.contains(val)){
            return false;
        }else{
        	hset.add(val);
            
        }
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hset.contains(val)){
            hset.remove(val);
        }else{
            return false;
        }
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int i = 0;
        int random =0;
        int randIndex = new Random().nextInt(hset.size());
        //System.out.println(randIndex);
    	for (Iterator iterator = hset.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			
			if(i==randIndex){
				random= (int)object;
				break;
			}
			i++;
		}
        return random;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	RandomizedSet obj = new RandomizedSet();
    	 boolean param_1 = obj.insert(3);
    	 System.out.println(param_1);
    	 boolean param_2 = obj.insert(4);
    	 System.out.println(param_2);
    	 boolean param_5 = obj.insert(5);
    	 boolean param_6 = obj.insert(6);
    	 boolean param_7 = obj.remove(7);
    	 
    	 int param_3 = obj.getRandom();
    	 System.out.println(param_3);
    	 boolean param_8 = obj.insert(3);
    	 System.out.println(param_8);
    	 
    	 
    	 
    	 int i=0;
    	 
    	 for(int ii=0;ii<10;){
    		 System.out.println("ii="+(++ii));
    		 
    	 }
    	 
    	 

	}
}

