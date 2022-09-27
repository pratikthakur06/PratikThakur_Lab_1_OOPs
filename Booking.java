package gl.oops.lab1;

public class Booking {

	private int roomNumber;
	private String floor;
	private String occupancy;
	private String isACRoom;
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public String getIsACRoom() {
		return isACRoom;
	}
	public void setIsACRoom(String isACRoom) {
		this.isACRoom = isACRoom;
	}
	public Booking(int roomNumber, String floor, String occupancy, String isACRoom) {
		super();
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.occupancy = occupancy;
		this.isACRoom = isACRoom;
	}
	
	public int estimatedTotalPrice(String occupancy, String isACRoom) {
		int totalPrice=0;
		if(isACRoom.equalsIgnoreCase("AC"))
			totalPrice=1000;
		switch (occupancy) {
		case "Single": {
			totalPrice+=2000;
			break;
		}
		case "Double": {
			totalPrice+=3000;
			break;
		}
		case "Triple": {
			totalPrice+=4000;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + occupancy);
		}
		return totalPrice;
	}
}
