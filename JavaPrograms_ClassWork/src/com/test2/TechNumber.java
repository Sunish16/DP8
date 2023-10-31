package com.test2;

import java.util.Scanner;

public class TechNumber {
	int num;
	int origNum;
	int lastpart, sum, power = 1;
	boolean tech;

	TechNumber() {
		num = 0;
		origNum = num;
	}

	TechNumber(int num) {
		this.num = num;
		origNum = num;
	}

	public int calculateSum() {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		for (int i = 1; i <= count / 2; i++) {
			power = power * 10;
		}
		if (count % 2 == 0) {
			num = origNum / power;
			lastpart = origNum % power;
			sum = num + lastpart;
			this.checkTechNumber();
			this.displayTechNumber();
		} else
			System.out.println("Invalid Number");
		return sum;
	}

	public boolean checkTechNumber() {
		if (origNum == (sum * sum))
			return tech = true;
		else
			return tech = false;
	}

	public void displayTechNumber() {
		if (tech == true)
			System.out.println(origNum + "is a Tech /number");
		else
			System.out.println(origNum + "It is not a Tech Number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		TechNumber obj = new TechNumber();
		obj.calculateSum();
	}

}
