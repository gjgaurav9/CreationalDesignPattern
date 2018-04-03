package builderpattern.improved;

public class SQLQuery implements Query {

	private String from;
	private String where;

	public void setFrom(String from) {
		this.from = from;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	@Override
	public void execute() {
		System.out.println("Executing from SQLQuery from "+from+" where "+where);
	}



}
