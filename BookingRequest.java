package gl.oops.lab1;

public class BookingRequest {

	private String occupancy;
	private String roomType;
	private String floor;
	
	public String getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(String occupancy) {
		this.occupancy = occupancy;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public BookingRequest(String occupancy, String roomType, String floor) {
		super();
		this.occupancy = occupancy;
		this.roomType = roomType;
		this.floor = floor;
	}
	
	
}
