package prototypepattern.improved;


public class Images extends Graphic {
	
	public void setUrl(String url) {
		this.url = url;
	}

	private String url;

	@Override
	public Graphic clone() {
		
		Images clone = new Images();
		clone.setUrl(this.url);
		return clone;
	}

	@Override
	public String getUrl() {
		return url;
	}
	

}
