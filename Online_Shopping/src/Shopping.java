public class Shopping {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.setProductName("Dell Laptop");
		laptop.setPrice(50000);
		laptop.setBrand("Dell");
		laptop.setRam(16);
		System.out.println("___LAPTOP DETAILS___");
		laptop.displayProductDetails();
		laptop.dispalyElectronicsdetails();
		laptop.displaylaptopDetails();
		Clothing clothing=new Clothing();
		clothing.setProductName("T-Shirt");
		clothing.setPrice(899);
		clothing.setSize("S");
		System.out.println("___CLOTHING DETAILS___");
		clothing.displayProductDetails();
		clothing.dispalyClothingDetails();
	}
}
