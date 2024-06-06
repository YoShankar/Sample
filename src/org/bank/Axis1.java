package org.bank;

public class Axis1 extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Deposit: 100,000");
	}
	public static void main(String[] args) {
		Axis1 a = new Axis1();
		a.deposit();
	}
	

}
