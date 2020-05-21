package test;

import com.mongodb.*;
import dao.ConexionBD;

public class TestTrabajoPracticoBaseDatosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MongoClient mongo = ConexionBD.getInstancia();
			
			mongo.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
