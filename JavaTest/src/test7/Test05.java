package test7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface Product2 {
	public String getName();

	public int getPrice();
}

class Clothes2 implements Product2 {

	private String name;
	private int price;

	public Clothes2(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

}

class Food implements Product2 {

	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

}

class Customer {

	private String uid;
	private String name;

	public Customer(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public String getName() {
		return name;
	}

}

class Order {
	private int orderNo;
	private Customer customer;
	private List<Product2> products;
	private int totalPrice;

	public Order(int orderNo, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
		this.products = new ArrayList<Product2>();
		this.totalPrice = 0;
	}

	public void addProduct(Product2 product) {
		this.products.add(product);
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Product2> getProducts() {
		return products;
	}

	public int getTotalAmount() {
		return totalPrice;
	}

}

class ShoppingMall {
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrdrers;

	public ShoppingMall() {
		this.customers = new ArrayList<Customer>();
		this.orders = new ArrayList<Order>();
		this.customerOrdrers = new HashMap<String, List<Order>>();
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}

}

public class Test05 {
	public static void main(String[] args) {
		// 쇼핑몰 생성
		ShoppingMall shoppingMall = new ShoppingMall();
		// 고객 생성
		Customer customer1 = new Customer("A101", "김유신");
		Customer customer2 = new Customer("A102", "김춘추");
		// 고객 추가
		shoppingMall.addCustomer(customer1);
		shoppingMall.addCustomer(customer2);
		// 제품 생성
		Product2 tshirt = new Clothes2("티셔츠", 15000);
		Product2 orange = new Food("오렌지", 3000);
		Product2 banana = new Food("바나나", 3500);
		// 주문 생성
		Order order1 = new Order(1, customer1);
		order1.addProduct(orange);
		order1.addProduct(tshirt);
		
		Order order2 = new Order(2, customer2);
		order2.addProduct(tshirt);
		order2.addProduct(banana);
		
		// 주문 추가
		shoppingMall.addOrder(order1);
		shoppingMall.addOrder(order2);
		// 모든 주문 출력
		List<Order> orders = shoppingMall.getOrders();
		for (Order order : orders) {
			System.out.println("주문번호 : " + order.getOrderNo());
			System.out.println("고객이름 : " + order.getCustomer().getName());
			System.out.println("주문금액 : " + "₩" + order.getTotalAmount());
			System.out.println("주문목록");
			for (Product2 product : order.getProducts()) {
				System.out.println(" - " + product.getName() + " ₩" + product.getPrice());
			}
			System.out.println();
		}
	}
}
