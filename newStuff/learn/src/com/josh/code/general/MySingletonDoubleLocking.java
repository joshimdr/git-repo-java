
package com.josh.code.general;

public class MySingletonDoubleLocking {

	private static MySingletonDoubleLocking ms = null;

	private MySingletonDoubleLocking() {

	}

	public static MySingletonDoubleLocking getInstance() {

		if (null == ms) {
			synchronized (MySingletonDoubleLocking.class) {

				if (null == ms) {

					ms = new MySingletonDoubleLocking();
				}

			}

		}

		return ms;
	}

}
