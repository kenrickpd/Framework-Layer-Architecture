package model;

public class HouseBuilder {
	private String name;
	private int room;
	private int garden;
	
	public HouseBuilder() {
		
	}
	
	public House build() {
		House newHouse = new House();
		newHouse.garden = this.garden;
		newHouse.name = this.name;
		newHouse.room = this.room;
		
		return newHouse;
	}

	public HouseBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public HouseBuilder setRoom(int room) {
		this.room = room;
		return this;
	}


	public HouseBuilder setGarden(int garden) {
		this.garden = garden;
		return this;
	}
	
}
