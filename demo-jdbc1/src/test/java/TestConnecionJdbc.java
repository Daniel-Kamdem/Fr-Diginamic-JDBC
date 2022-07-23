import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnecionJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResourceBundle Bundle = ResourceBundle.getBundle("database");
		
		final String url = Bundle.getString("jdbc.db.url");
		final String user = Bundle.getString("jdbc.db.user");
		final String password = Bundle.getString("jdbc.db.pw");
		
		try {
			Connection sql = DriverManager.getConnection( url , user , password );
			
			
			
			System.out.println(sql);
			
			sql.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
