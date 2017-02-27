package com.josh.learn;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;


public class ConcurrentHashMapExample
{
    
    
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
        System.out.println();
        System.out.println();
        
        Iterator iter2 = premiumPhone.keySet().iterator();
        
        while (iter2.hasNext())
        {
            System.out.println(premiumPhone.get(iter2.next()));
            premiumPhone.put("Sony2", "Xperia2 Z2");
        }
        
        System.out.println();
        System.out.println();
        
        

        Iterator iter3 = premiumPhone.keySet().iterator();
        
        while (iter3.hasNext())
        {
            System.out.println(premiumPhone.get(iter3.next()));
            premiumPhone.put("Sony3", "Xperia3 Z3");
        }
        
    }
    
}