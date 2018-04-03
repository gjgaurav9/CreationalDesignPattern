package builderpattern.trial;

import java.awt.dnd.DnDConstants;

public class Client {

	public static void main(String[] args) {


		String from = "clientTable";
		String where = "clientname = ...";
		
		MongoDBQuery dbQuery  = new MongoDBQuery();
		dbQuery.setFrom(from);
		dbQuery.setWhere(where);
		dbQuery.execute();
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setFrom(from);
		sqlQuery.setWhere(where);
		sqlQuery.execute();
		
	}

}
