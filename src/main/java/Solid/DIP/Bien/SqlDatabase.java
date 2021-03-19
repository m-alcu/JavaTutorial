package Solid.DIP.Bien;

public class SqlDatabase implements Persistence {

	@Override
	public void save(Shopping shopping) {
		System.out.println("save database");
	}
}