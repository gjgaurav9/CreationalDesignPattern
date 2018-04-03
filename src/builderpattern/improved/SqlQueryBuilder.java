package builderpattern.improved;

public class SqlQueryBuilder implements QueryBuilder{
	
	private SQLQuery sQLQuery = new SQLQuery();

	@Override
	public void from(String from) {
		 sQLQuery.setFrom(from);
		
	}

	@Override
	public void where(String where) {
		sQLQuery.setWhere(where);
		
	}

	@Override
	public Query getQuery() {
		// TODO Auto-generated method stub
		return sQLQuery;
	}

}
