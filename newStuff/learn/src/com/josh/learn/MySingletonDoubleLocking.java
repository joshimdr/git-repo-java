package com.josh.learn;

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
