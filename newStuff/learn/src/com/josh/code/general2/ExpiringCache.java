/**
 * 
 */
package com.josh.code.general2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author munish
 *
 */
public class ExpiringCache {

	CacheNode head = null;
	CacheNode tail = null;
	// time to expire in millis - 10000 is 10 secs
	long timeToExpire = 10000;
	Map map = new HashMap();

	// returns value if its within the timestamp
	public CacheNode getValue(Integer key) {

		CacheNode val = (CacheNode) map.get(key);

		if (val == null) {
			return null;
		} else {
			CacheNode returnVal;
			if (System.currentTimeMillis() - val.timestamp >= timeToExpire) {
				while (val.next != null) {
					CacheNode removeExpiredElement = val;
					map.remove(removeExpiredElement.value);
					val = val.next;
				}
				returnVal = null;
			} else {

				val.prev.next = val.next;
				val.next.prev = val.prev;

				CacheNode currentHead = head;
				head = val;
				head.next = currentHead;

				returnVal = head;

			}

			return returnVal;
		}

	}

	// puts the value in the hashmap and assign it as head
	public void putValue(Integer n) {
		CacheNode n2 = new CacheNode(n);
		n2.timestamp = System.currentTimeMillis();
		map.put(n, n2);
		CacheNode temp = head;
		head = n2;
		head.next = temp;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CacheNode {

	Integer value = null;
	CacheNode prev;
	CacheNode next;
	public static long timestamp;

	public CacheNode(Integer v) {
		value = v;

	}

}
