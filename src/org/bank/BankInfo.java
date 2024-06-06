package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
	System.out.println("Savings : 25,000");

}
private void fixed() {
	System.out.println("Fixed : 95,000");

}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.deposit();
	b.savings();
	b.fixed();
}
}
