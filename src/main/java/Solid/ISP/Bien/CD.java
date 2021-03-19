package Solid.ISP.Bien;

import java.util.Date;

public class CD implements Product {

	String name;
	int stock;
	int numberOfDisks;
	Date releaseDate;

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	public int getNumberOfDisks() {
		return numberOfDisks;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setNumberOfDisks(int numberOfDisks) {
		this.numberOfDisks = numberOfDisks;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}