package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//Dao dataaccess object anlamına geliiyor.
public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadeve db erişim kodları yazılır... sql
		System.out.println("JDBC ile veritabanına eklendi");
	}
	

}
