package com.josh.code.general;

public class MySingletonEager {

	private static final MySingletonEager mysing = new MySingletonEager();

	private MySingletonEager() {

	}

	public MySingletonEager getInstance() {

		return mysing;

	}

}
