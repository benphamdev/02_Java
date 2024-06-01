package bai2;

public class BankAccount {
	private String id, customerId, stk, pinCode;
	private int balance;

	public BankAccount() {

	}

	public BankAccount(String id, String customerId, String stk, String pinCode, int balance) {
		this.id = id;
		this.customerId = customerId;
		this.stk = stk;
		this.pinCode = pinCode;
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void withdraw(int money) {
		if (this.balance - money >= 50000) {
			this.balance -= money;
		}
	}

	public void recharge(int money) {
		this.balance += money;
	}

	public static int findPos(BankAccount[] a, String s) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].stk.equals(s)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "id = " + id + "\ncustomerId = " + customerId + "\nstk = " + stk + "\npinCode = " + pinCode
				+ "\nbalance = " + balance + "VND\n" + "-----------------\n";
	}
}
