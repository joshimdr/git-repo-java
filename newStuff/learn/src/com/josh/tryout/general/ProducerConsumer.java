/**
 * 
 */
package com.josh.tryout.general;

import java.util.Random;

/**
 * @author Munish
 *
 */
public class ProducerConsumer {

	/**
	 * 
	 */
	public ProducerConsumer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedBox sb = new SharedBox();

		Thread t1 = new Producer(sb);
		Thread t2 = new Consumer(sb);

		t1.start();
		t2.start();

	}

}

class SharedBox {
	boolean valueAvailable = false;
	int value = 0;

	public boolean isValueAvailable() {
		return valueAvailable;
	}

	public void setValueAvailable(boolean valueAvailable) {
		this.valueAvailable = valueAvailable;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class Producer extends Thread {

	SharedBox sharedBox;

	public Producer(SharedBox sb) {
		this.sharedBox = sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			produce();
		}
	}

	public void produce() {

		while (sharedBox.valueAvailable) {

			try {
				// Wait for 1 to 10 secs
				Thread.sleep(1000 * (new Random().nextInt(10) + 1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int newVal = new Random().nextInt(100);
		sharedBox.setValue(newVal);
		System.out.println("Hey i Produced a new value:" + newVal);
		sharedBox.setValueAvailable(true);

	}

}

class Consumer extends Thread {
	SharedBox sharedBox;

	public Consumer(SharedBox sb) {
		this.sharedBox = sb;
	}

	@Override
	public void run() {
		while (true) {
			consume();
		}

	}

	public void consume() {

		while (!sharedBox.valueAvailable) {

			try {
				Thread.sleep(1000 * (new Random().nextInt(10) + 1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int value = sharedBox.getValue();
		System.out.println("Hey i consumed a new value:" + value);
		sharedBox.setValueAvailable(false);
	}

}
