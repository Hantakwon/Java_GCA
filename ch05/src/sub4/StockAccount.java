package sub4;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String sotck, int amount, int price) {
		super(bank, id, name, balance);
		this.stock = sotck;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balcance += amount * price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balcance -= amount * price;
	}
	
	public void show() {
		System.out.println("증권사 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balcance);
		System.out.println("주식 종목 : " + this.stock);
		System.out.println("현재 수량 : " + this.amount);
		System.out.println("현재 가격 : " + this.price);
	}
	
}
