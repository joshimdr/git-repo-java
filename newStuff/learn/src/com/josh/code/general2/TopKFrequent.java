/**
 * 
 */
package com.josh.code.general2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.josh.tryout.util.Helper;

/**
 * @author munish
 *
 */
public class TopKFrequent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {2,2,3,4,5,6,2,3,4,5,6,7,7,7,8,2,2,2,2,3,3,3,3,3,4,4,4,4,4};

		Map<Integer,Integer> mapEntries = topKFrequent(numbers, 5);
		
		Helper.print(mapEntries);
		
		
		
	}
	
	private static Map<Integer,Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        // count frequency
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        // create priority queue, ordering map entries with respect to the frequency
        PriorityQueue<Map.Entry<Integer, Integer>> queue = 
        new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>()
        {
           @Override
           public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2)
             {
                return entry2.getValue() - entry1.getValue();
             }
        });
    
        
        // insert in the queue
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            queue.offer(entry);
        }
        
        // poll the top k
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        for(int i = 0; i < k; i ++){
            Map.Entry<Integer, Integer> entry = queue.poll();
            list.put(entry.getKey(), entry.getValue());
        }
        
        return list;
    }

}
