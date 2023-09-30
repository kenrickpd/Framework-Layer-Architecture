package model;

public class House implements Cloneable {
	//design pattern prototype tinggal implements Cloneable aja
	
	protected String name;
	protected int room;
	protected int garden;
	
	//generate constructor pake alt + shift + s
	
	protected House() {
	} 
	
	@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getGarden() {
		return garden;
	}
	
	public void sebutSaya() {
		System.out.println("nama: " + this.name + " garden: " + this.garden + " room: " + this.room);
	}

	public void setGarden(int garden) {
		this.garden = garden;
	}	
}
