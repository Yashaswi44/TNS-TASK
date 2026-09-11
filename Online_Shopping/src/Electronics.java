public class Electronics extends Product {
	private String Brand;
	public void setBrand(String Brand) {
		this.Brand=Brand;
	}
	public String getBrand() {
		return Brand;
	}
	public void dispalyElectronicsdetails() {
		System.out.println("Brand:" + Brand);
	}
}
