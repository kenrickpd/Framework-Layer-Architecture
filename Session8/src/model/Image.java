package model;

public class Image implements Displayable{
	String fileName;
	
	public Image(String fileName) {
		this.fileName = fileName;
		loading();
	}
	
	public void loading() {
		System.out.println("Loading......");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying image: " + fileName);
	}
}
