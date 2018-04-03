package builderpattern.improved;

public class MongoDBQueryBuilder implements QueryBuilder {
	
	private MongoDBQuery mongoDBQuery = new MongoDBQuery();

	@Override
	public void from(String from) {
		mongoDBQuery.setFrom(from);

	}

	@Override
	public void where(String where) {
		mongoDBQuery.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return mongoDBQuery;
	}

}
