package builderpattern.improved;

public interface QueryBuilder {
	
	void from(String from);
	void where(String where);
	Query getQuery();

}
