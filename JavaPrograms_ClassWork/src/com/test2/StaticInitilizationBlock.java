package com.test2;

class A {
	static int i;

	static {
		System.out.println(1);

		i = 100;
	}
}

class StaticInitializationBlock {
	static {
		System.out.println(2);
	}

	public static void main(String[] args) {
		System.out.println(3);

		System.out.println(A.i);
	}
}

public class StaticInitilizationBlock {

}
