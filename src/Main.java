import java.io.IOException;
import java.sql.SQLException;

import com.greenBottle.bean.Client;
import com.greenBottle.dao.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClientDao clientdao = new ClientDao();
try {
	Client monClient = new Client();
	monClient = clientdao.getClientByMailAndPassword("jcpemd@jcpemd.com");
	System.out.println(monClient.getPrenom());
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
