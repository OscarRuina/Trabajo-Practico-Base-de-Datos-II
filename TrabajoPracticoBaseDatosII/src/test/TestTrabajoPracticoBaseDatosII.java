package test;

import java.util.List;

import com.mongodb.*;

public class TestTrabajoPracticoBaseDatosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MongoClient mongo = crearConexion();
			
			printDatabases(mongo);
			
			cerrarConexion(mongo);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static MongoClient crearConexion() {
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return mongo;
	}
	
	private static void cerrarConexion(MongoClient mongo) {
		mongo.close();
	}
	
	private static void printDatabases(MongoClient mongo) {
		@SuppressWarnings("deprecation")
		List<String> dbs = mongo.getDatabaseNames();
		for (String db : dbs) {
			System.out.println(" - " + db);
		}
	}
	

}



