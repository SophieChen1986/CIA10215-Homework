package homework9;

class BankAccount extends Thread {
	private int balance = 0;  // 戶頭金額
	
	// 存錢
	synchronized public void deposit(int amount) {
		while ( balance >= 3000 ) {  // 餘額超過3000元
			System.out.println("媽媽到到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("媽媽被熊大要求匯款!");
		}
		balance += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);
		notify();
	}
	
	synchronized public void withdraw(int amount) {
		while ( balance < amount ) {  // 沒有錢了  
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();  // 熊大只能等媽媽
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("熊大被老媽告知已經有錢!");
		}
		balance -= 1000;
		System.out.println("熊大領了" + amount + "，帳戶共有：" + balance);
		
		if ( balance <= 2000 ) {  // 低於2000元，要求媽媽匯款
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

// 媽媽
class Mommy extends Thread {
	BankAccount bankAccount;
	
	public Mommy(BankAccount bankAccount) {
		this.bankAccount = bankAccount; 
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++)
			bankAccount.deposit(2000);  // 媽媽一次匯款2000元
	}
}

// 熊大
class Brown extends Thread {
	BankAccount bankAccount;
	
	public Brown(BankAccount bankAccount) {
		this.bankAccount = bankAccount; 
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++)
			bankAccount.withdraw(1000);  // 熊大每次提款1000元
	}
}

public class Hw9_2 {
	
	/*
	 * • 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,
	 * 所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
	 * 但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
	 * 如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
	 * 假設媽媽一次匯款2000元,熊大一次提款1000元,
	 * 寫一個Java程式模擬匯款10次與提款10次的情形。
	 * 
	 * 參考講義: p336
	 * 參考範例: TestJoin.java
	 * 
	 */

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		// 因為是針對同一個帳戶操作，所以把同一個帳戶物件分別設定給兩個人。
		
		Mommy mommy = new Mommy(bankAccount);
		Brown brown = new Brown(bankAccount);
		
		mommy.start();
		brown.start();
	}

}
