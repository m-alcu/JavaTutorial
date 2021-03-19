package Solid.ISP.Bien;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		System.out.println("========================== ");

		DVD dvd = new DVD();
		dvd.setName("El Nombre de la Rosa");
		Date dvdDate = (Date) new GregorianCalendar(1986, 9, 1).getTime();
		dvd.setReleaseDate(dvdDate);
		dvd.setNumberOfDisks(1);
		dvd.setStock(1);
		dvd.setRecommendedAge(13);

		System.out.println("Nombre: " + dvd.name);
		System.out.println("ReleaseDate: " + dvd.getReleaseDate());
		System.out.println("Number of Disks: " + dvd.numberOfDisks);
		System.out.println("Stock: " + dvd.getStock());
		System.out.println("Edad recomendada: " + dvd.getRecommendedAge());

		System.out.println("========================== ");

		CD cd = new CD();
		cd.setName("Nevermind");

		Date cdDate = (Date) new GregorianCalendar(1991, 9, 24).getTime();

		cd.setReleaseDate(cdDate);
		cd.setNumberOfDisks(1);
		cd.setStock(1);

		System.out.println("Nombre: " + cd.name);
		System.out.println("ReleaseDate: " + cd.getReleaseDate());
		System.out.println("Number of Disks: " + cd.numberOfDisks);
		System.out.println("Stock: " + cd.getStock());

	}
}