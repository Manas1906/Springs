package springdemo;

public class Bike {
	String brand;
	double price;
	int cc;

	MusicSystem musicSystem;

	public Bike(String brand, double price, int cc, MusicSystem musicSystem) {
		super();
		this.brand = brand;
		this.price = price;
		this.cc = cc;
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", cc=" + cc + ", musicSystem=" + musicSystem + "]";
	}

}