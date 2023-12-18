package proxy;

import model.Displayable;
import model.Image;

public class ImageVirtualProxy implements Displayable{
	String fileName;
	private Image image = null;
	
	public ImageVirtualProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(image == null) {
			image = new Image(fileName);
		}
		
		image.display();
	}
}
