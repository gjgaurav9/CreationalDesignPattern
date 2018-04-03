package builderpattern.improved;

public class Client {

	public static void main(String[] args) {

		QueryBuildDirector buildDirector = new QueryBuildDirector();
		
		String from = "clientTable";
		String where = "clientname = ...";
		
		QueryBuilder builder = new SqlQueryBuilder();
		Query querySQL = buildDirector.buildQuery(from, where, builder);
		querySQL.execute(); 
		
		QueryBuilder mongoDBQueryBuilder = new MongoDBQueryBuilder();
		Query queryMongoDB = buildDirector.buildQuery(from, where, mongoDBQueryBuilder);
			queryMongoDB.execute();
	}

}
