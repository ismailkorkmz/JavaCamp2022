package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadeve db erişim kodları yazılır... sql
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
