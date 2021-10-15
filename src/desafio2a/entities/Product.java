package desafio2a.entities;

public class Product {
	
	public String name;
	public double value;
	public double tax;

	public double TotalValue() {
		return value + tax;
	}
	
	public void DiscountProduct(double percentage) {
		value -= value * percentage/100;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", TotalValue()=" + TotalValue() + "]";
	}
	
	/*public String toString() {
		return "Name: " + name
				+ ", "
				+ " Total Value: $ "
				+ String.format("%.2f", TotalValue());
	}*/
	
	
}
