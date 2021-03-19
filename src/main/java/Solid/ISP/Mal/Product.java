package Solid.ISP.Mal;

import java.util.Date;

public interface Product {

	String getName();

	int getStock();

	int getNumberOfDisks();

	Date getReleaseDate();

	// A�adimos el DVD...

	int getRecommendedAge();
}