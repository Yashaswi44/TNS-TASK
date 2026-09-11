public class Product {
	private String productName;
	private double price;
	public void setProductName(String productName) {
		this.productName=productName;
    }
	public void setPrice(double price) {
		this.price=price;
	}
	public String getProductName() {
		return productName;
	}
	public double getprice() {
		return price;
	}
	public void displayProductDetails() {
		System.out.println("Product Name:" + productName);
		System.out.println("Price:" + price);
	}
}
