package prob5;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money) {
		balance += money;
		System.out.println(accountNo+" 계좌에 "+money+"만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println(accountNo+" 계좌에 "+money+"만원이 출금되었습니다.");
		}else {
			System.out.println("잔액을 초과하는 금액은 출금할 수 없습니다.");
		}
	}
	
}