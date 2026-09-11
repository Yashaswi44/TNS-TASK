public class Laptop extends Electronics{
	private int ram;
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void displaylaptopDetails() {
		System.out.println("RAM:" + ram + "GB");
	}
}
