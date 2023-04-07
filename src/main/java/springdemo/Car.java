package springdemo;

public class Car {
	String brand;
	String color;
	int topspeed;

	MusicSystem musicSystem;

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public String toString() {
		return "Car brand=" + brand + ", color=" + color + ", topspeed=" + topspeed;
	}
}
