package gl.oops.lab1;

import java.util.List;

public class Hotel {

	private String name;
	private String address;
	private int totalNumberOfRooms;
	private int totalNumberOfFloors;
	private float ratings;
	private String category;
	
	private List<Room> rooms;
	private Booking booking;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTotalNumberOfRooms() {
		return totalNumberOfRooms;
	}
	public void setTotalNumberOfRooms(int totalNumberOfRooms) {
		this.totalNumberOfRooms = totalNumberOfRooms;
	}
	public int getTotalNumberOfFloors() {
		return totalNumberOfFloors;
	}
	public void setTotalNumberOfFloors(int totalNumberOfFloors) {
		this.totalNumberOfFloors = totalNumberOfFloors;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Hotel(String name, String address, int totalNumberOfRooms, int totalNumberOfFloors, float ratings,
			String category) {
		super();
		this.name = name;
		this.address = address;
		this.totalNumberOfRooms = totalNumberOfRooms;
		this.totalNumberOfFloors = totalNumberOfFloors;
		this.ratings = ratings;
		this.category = category;
	}
	
}
