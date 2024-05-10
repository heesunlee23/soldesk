package chapter19.HashMap;

import java.util.Objects;

public class Product {
	
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 이름이 같으면 같은 객체라고 인식하게 하기 위해 추가 
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	// 이름이 같으면 같은 객체라고 인식하게 하기 위해 추가 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "상품 이름 : " + name + "\t 가격 : " + price + "\t";
	}
	
	
}
