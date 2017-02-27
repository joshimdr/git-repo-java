/**
 * 
 */
package com.josh.code.general;

import java.util.ArrayList;

/**
 * @author munish
 *
 */
public class MyClass {

	/**
	 * @param args
	 */

	private static RequestTime[] lockWithTimeStamp = new RequestTime[10];

	private static boolean checkIfCallValid() {

		boolean valid = false;

		for (int i = 0; i < lockWithTimeStamp.length; i++) {

			if (lockWithTimeStamp[i] != null) {

				if (System.currentTimeMillis()  - lockWithTimeStamp[i].getTimeStampInMillis()   > 1000) {
					RequestTime rt = new RequestTime();
					rt.setTimeStampInMillis(System.currentTimeMillis());
					lockWithTimeStamp[i] = rt;
					valid = true;
					break;

				} else {
					valid = false;
				}
			} else {
				RequestTime rt = new RequestTime();
				rt.setTimeStampInMillis(System.currentTimeMillis());
				lockWithTimeStamp[i] = rt;
				valid = true;
				break;
			}

		}

		return valid;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyClass mc = new MyClass();

		for (int i = 0; i < 11; i++) {
			System.out.println(mc.checkIfCallValid());
		}

		Thread.sleep(998);

		for (int i = 0; i < 11; i++) {
			System.out.println(mc.checkIfCallValid());
		}

	}

}
