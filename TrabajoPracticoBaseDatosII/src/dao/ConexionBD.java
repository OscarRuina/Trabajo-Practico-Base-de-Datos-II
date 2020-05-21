package dao;

import com.mongodb.*;

public class ConexionBD {
	
	private static MongoClient instancia;
	
	public static MongoClient getInstancia() {
		if(instancia == null) {
			instancia = new MongoClient("localhost",27017);
		}
		return instancia;
	}
	
}
