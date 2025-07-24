package test7;

import java.util.ArrayList;
import java.util.List;

class Product {
	protected String prodId;
	protected String prodName;
	protected int price;
	protected int quanity;

	public Product(String prodId, String prodName, int price, int quanity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quanity = quanity;
	}

	public void printProductInfo() {
	}
}

class Computer extends Product {

	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quanity, String manufactor) {
		super(prodId, prodName, price, quanity);
		this.manufactor = manufactor;
	}

	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품코드 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quanity);
		System.out.println("제조사 : " + manufactor);
	}

}

class Clothes extends Product {

	private String size;

	public Clothes(String prodId, String prodName, int price, int quanity, String size) {
		super(prodId, prodName, price, quanity);
		this.size = size;
	}

	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품코드 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quanity);
		System.out.println("사이즈 : " + size);
	}

}

public class Test02 {
	public static void main(String[] args) {
		// 컴퓨터 객체 생성
		Computer computer = new Computer("E001", "데스크탑", 150, 10, "삼성전자");
		computer.printProductInfo();
		System.out.println("----------------");
		// 의류 객체 생성
		Clothes tshirt = new Clothes("C001", "T-Shirt", 20, 50, "L");
		tshirt.printProductInfo();
		System.out.println("----------------");
		}
}
