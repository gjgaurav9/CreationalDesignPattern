package prototypepattern.improved;

public class GraphicTool {
	
	private Graphic prototype;
	
	protected Graphic createGraphic() {
		return prototype.clone();
	}
	
	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}
	
	
	

}
