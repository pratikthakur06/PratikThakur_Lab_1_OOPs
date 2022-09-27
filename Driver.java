package gl.oops.lab1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hotel hotel = new Hotel("JW Marriot", "Kolkata", 7, 2, 4.8f, "5 Star");
		Room room1 = new Room(101, "Available", "1", "Single", "AC");
		Room room2 = new Room(102, "Available", "1", "Double", "AC");
		Room room3 = new Room(103, "Available", "1", "Double", "Non-AC");
		Room room4 = new Room(201, "Available", "2", "Single", "AC");
		Room room5 = new Room(202, "Available", "2", "Single", "Non-AC");
		Room room6 = new Room(203, "Available", "2", "Double", "AC");
		Room room7 = new Room(204, "Available", "2", "Triple", "AC");
		
		hotel.setRooms(Arrays.asList(room1,room2,room3,room4,room5,room6,room7));
		
//		To check availabilty of room
//		for(int i=0;i<hotel.getRooms().size();i++) {
//			System.out.println(hotel.getRooms().get(i).getRoomNumber()+" | "+hotel.getRooms().get(i).getRoomStatus());
//		}
		
		int choice = 1;
		
		while(choice==1) {
			System.out.println("Welcome to "+ hotel.getName()+ " hotel !!!");
			System.out.println("Please select the room occupancy type (Single/Double/Triple):");
			String occupancy = sc.next();
			sc.nextLine();
			System.out.println("Please select room type(AC/Non-AC):");
			String roomType = sc.nextLine();
			System.out.println("Please select floor preference if any (None/1/2):");
			String floor = sc.nextLine();
			
			BookingRequest request = new BookingRequest(occupancy, roomType, floor);
			
			List<Room> rooms = hotel.getRooms();
			boolean isAvailable = true;
			
			for(Room room : rooms) {
				if((request.getFloor().equals(room.getFloorNumber()) && request.getOccupancy().equals(room.getOccupancy()))) {
					if(room.getRoomStatus().equals("Available") && request.getRoomType().equals(room.getIsACRoom())) {
						Booking booking = new Booking(room.getRoomNumber(), room.getFloorNumber(), room.getOccupancy(), room.getIsACRoom());
						hotel.setBooking(booking);
						Booking booking2 = hotel.getBooking();
						System.out.println("Room Number: "+booking2.getRoomNumber()+", Floor Number: "+booking2.getFloor()+", "+booking2.getIsACRoom()+", "+booking2.getOccupancy()+" Occupancy, Estimated Price: "+booking2.estimatedTotalPrice(room.getOccupancy(), room.getIsACRoom())+"/day");
						room.setRoomStatus("Occupied");
						isAvailable = true;
						break;
					}
					else {
						isAvailable = false;
					}
				}
				else if(request.getFloor().equals("None")) {
					if((request.getOccupancy().equals(room.getOccupancy()))) {
						if(room.getRoomStatus().equals("Available") && request.getRoomType().equals(room.getIsACRoom())) {
							Booking booking = new Booking(room.getRoomNumber(), room.getFloorNumber(), room.getOccupancy(), room.getIsACRoom());
							hotel.setBooking(booking);
							Booking booking2 = hotel.getBooking();
							System.out.println("Room Number: "+booking2.getRoomNumber()+", Floor Number: "+booking2.getFloor()+", "+booking2.getIsACRoom()+", "+booking2.getOccupancy()+" Occupancy, Estimated Price: "+booking2.estimatedTotalPrice(room.getOccupancy(), room.getIsACRoom())+"/day");
							room.setRoomStatus("Occupied");
							isAvailable = true;
							break;
						}
						else {
							isAvailable = false;
						}
					}
				}
			}
			if(isAvailable == false) {
				System.out.println("Sorry!, "+request.getOccupancy()+" Occupancy "+request.getRoomType()+" room not available.");
			}
			System.out.println("Press 1 to go to Booking menu or 0 to exit!!!");
			choice = sc.nextInt();
			
//			To check availabilty of room
//			for(int i=0;i<hotel.getRooms().size();i++) {
//				System.out.println(hotel.getRooms().get(i).getRoomNumber()+" | "+hotel.getRooms().get(i).getRoomStatus());
//			}
		}
	}
}
