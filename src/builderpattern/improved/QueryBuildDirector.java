package builderpattern.improved;

public class QueryBuildDirector { 	
	
	public Query buildQuery(String from, String where, QueryBuilder queryBuilder ) {
		
		queryBuilder.from(from);
		queryBuilder.where(where);
		return queryBuilder.getQuery() ;
	}

}
