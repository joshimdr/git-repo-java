package com.josh.code.general;

public class ArrayAsStack {

	int top = -1;

	int[] intArr = new int[10];

	int minimum = -1;

	private void pushOnStack(int element) {

		if (top >= intArr.length - 1) {
			System.out.println("Can not add more elements, stack is already full !");
		}
		top = top + 1;
		intArr[top] = element;
		setMinimumElement(element, top);

	}

	private int popFromStack() {

		int valueOnTop;
		if (top < 0) {
			top = 0;
			System.out.println("No value in stack at present.");
		}
		valueOnTop = intArr[top];

		if (top == minimum) {
			setNewMin();

		}

		intArr[top] = 0;
		top = top - 1;
		return valueOnTop;

	}

	private int returnMinimumElement() {

		return intArr[minimum];

	}

	private void printStack() {
		System.out.println("elements in stack: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(", " + intArr[i]);
		}

	}

	private void setNewMin() {
		int minIndex = 0;

		if (intArr.length > 0) {
			int min = intArr[0];

			for (int i = 0; i < top; i++) {
				if (min > intArr[i]) {
					min = intArr[i];
					minIndex = i;
				}

			}
		}
		minimum = minIndex;

	}

	private void setMinimumElement(int element, int index) {
		if (minimum >= 0) {
			if (element < intArr[minimum]) {
				minimum = index;
			}
		} else {
			minimum = 0;
		}
	}

	public static void main(String[] args) {
		ArrayAsStack aas = new ArrayAsStack();
		aas.pushOnStack(3);
		aas.pushOnStack(5);
		aas.pushOnStack(31);
		aas.pushOnStack(32);
		aas.pushOnStack(35);

		aas.printStack();
		System.out.println();
		System.out.println("Popped Element 1:" + aas.popFromStack());
		aas.printStack();

		System.out.println("1. the new minimum:" + aas.intArr[aas.minimum]);

		aas.pushOnStack(7);
		aas.pushOnStack(8);
		aas.pushOnStack(1);
		aas.pushOnStack(2);
		System.out.println("2. the new minimum:" + aas.intArr[aas.minimum]);

		aas.pushOnStack(9);

		aas.printStack();
		System.out.println();
		System.out.println("Popped Element 2:" + aas.popFromStack());
		aas.printStack();

	}

}
