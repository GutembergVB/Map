package entities;

import java.util.Objects;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
	    this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
    @Override
	public String toString() {
		return "Product ("+ name + "," + price + ")";
	}
	/*ALL COOKIES: 
    	phone: 91234567
    	username: Maria
    	Contains 'phone' key: true
    	Contains value de 'phone key: [91234567, Maria]
    	phone number: 91234567
    	Email: null
    	Size: 2
    	-----------------------------------------------------------------------------
    	Contains 'ps' key: true
    	10000.0
    	20000.0
    	15000.0 */
}
