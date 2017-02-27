/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class MySingletonVolatile {

	private static volatile MySingletonVolatile ms;

	private MySingletonVolatile() {

	}

	public MySingletonVolatile getInstance() {

		if (ms == null) {

			synchronized (MySingletonVolatile.class) {

				if (ms == null) {
					ms = new MySingletonVolatile();
				}

			}

		}

		return ms;

	}

}
