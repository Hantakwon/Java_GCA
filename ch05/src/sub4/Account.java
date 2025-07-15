package sub4;

public class Account {

	// 속성
	protected String bank;
	protected String id;
	protected String name;
	protected int balcance;
	
	public Account(String bank, String id, String name, int balcance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balcance = balcance;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	// 기능
	public void deposit(int money) {
		this.balcance += money;
	}

	public void withdraw(int money) {
		this.balcance -= money;
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("입금주 : " + name);
		System.out.println("현재 잔액 : " + balcance);
		System.out.println("-------------------------");
		
	}
}
