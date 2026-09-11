public class Clothing extends Product {
	private String size;
	public void setSize(String size) {
		this.size=size;
	}
	public String getSize() {
		return size;
	}
	public void dispalyClothingDetails() {
		System.out.println("Size:" + size);
	}
}
