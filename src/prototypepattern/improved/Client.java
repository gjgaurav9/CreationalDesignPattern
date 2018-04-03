package prototypepattern.improved;

import javax.tools.Tool;

public class Client {

	public static void main(String[] args) {

		Images images = new Images();
		images.setUrl("http://test.com");
		GraphicTool graphicTool = new GraphicTool(images);
		Graphic graphic = graphicTool.createGraphic();	
		System.out.println("Graphic Instance "+graphic.getClass());
		System.out.println("Graphic url "+images.getUrl());
		
		
		//It is possible to change anything at Runtime and no to rewire the system
		images.setUrl("testing new");
		graphicTool = new GraphicTool(images);
		System.out.println("Graphic url "+images.getUrl());
		
		
		Videos videos = new Videos();
		videos.setUrl("http://test.video.com");
		//System.out.println(videos.getUrl());
		graphicTool = new GraphicTool(videos);
		graphic = graphicTool.createGraphic();	
		System.out.println("Graphic Instance "+graphic.getClass());
		System.out.println("Graphic url "+videos.getUrl());

	}

}
