package by.academy.homework3;

import java.util.Arrays;
import java.time.LocalDate;


public class Deal {

	String adress;
	User buyer;
	User seller;
	Product[] products;
	int index = 0;
	LocalDate deadLineDate = LocalDate.now().plusDays(10);
	

	public Deal(String adress, User buyer, User seller, Product[] products) {
		super();
		this.adress = adress;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public Deal() {
		super();
		products = new Product[10];
	}

	public double calPrice() {
		double price = 0;
		for (Product p : products) {
			if (p == null) {
				continue;
			}
			price += p.calcFullPrice();

		}
		return price;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String toString() {
		return "Deal [adress=" + adress + ", buyer=" + buyer + ", seller=" + seller + ", products="
				+ Arrays.toString(products) + " deaLineDate " + deaLineDate "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

	private void grows() {
		Product[] temp = new Product[products.length + 1];
		products = temp;
	}

	public void addProduct(Product p) {
		if (index >= products.length) {
			grows();
		}
		products[index++] = p;
	}

	public void remove() {
		if (index == 0) {
			return;
		}
		products[--index] = null;
	}

	public void name() {

	}

	public void addProduct() {
		if (products == null) {
			products = new Product[10];
		}
		if (index >= products.length) {
			grows();
		}

	}

	public void remove1() {
		if (products == null || index == 0) {
			return;
		}
		if (index >= 0 && index < products.length) {
			products[index] = null;
		}
	}

}
