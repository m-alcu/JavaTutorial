package Solid.ISP.Mal;

import java.util.Date;

public class DVD implements Product {

	String name;
	int stock;
	int numberOfDisks;
	Date releaseDate;
	int recommendedAge;

	public int getRecommendedAge() {
		return recommendedAge;
	}

	public void setRecommendedAge(int recommendedAge) {
		this.recommendedAge = recommendedAge;
	}

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