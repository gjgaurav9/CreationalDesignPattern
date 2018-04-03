package prototypepattern.improved;

public class Videos extends Graphic {
	
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public Graphic clone() {
		
		Videos clone = new Videos();
		clone.setUrl(this.url);
		return clone;
	}
	
	@Override
	public String getUrl() {
		return url;
	}
	

	
}
