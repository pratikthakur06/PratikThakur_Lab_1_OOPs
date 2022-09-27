package gl.oops.lab1;

public class Room {
	
	private int roomNumber;
	private String roomStatus;
	private String floorNumber;
	private String occupancy;
	private String isACRoom;
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
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
	public Room(int roomNumber, String roomStatus, String floorNumber, String occupancy, String isACRoom) {
		super();
		this.roomNumber = roomNumber;
		this.roomStatus = roomStatus;
		this.floorNumber = floorNumber;
		this.occupancy = occupancy;
		this.isACRoom = isACRoom;
	}
	
	
}
