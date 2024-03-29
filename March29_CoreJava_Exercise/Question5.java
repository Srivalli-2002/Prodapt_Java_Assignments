package march29.corejava.assignment;

import java.util.Scanner;

public class Question5 {
	
    //seating chart with row and seat numbers
    public static void showSeatingChart(String[][] seats, int startRow, int endRow) {
    	char ch='A';
    	System.out.print("   ");
    	for (int i = startRow-1; i < Math.min(seats.length, endRow); i++)
    	{
    		System.out.print(ch+" ");
    		ch++;
    	}
    	System.out.println();
        for (int i = startRow - 1; i < Math.min(seats.length, endRow); i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print("X ");
                }
            }
            
            System.out.println();
        }
    }

    // Add a passenger to a selected seat
    public static boolean addPassengerToSeat(String[][] seats, String seat, String passengerName) {
    	try {
        int row = Integer.parseInt(seat.substring(0, seat.indexOf('-'))) - 1;
        int col = seat.charAt(seat.indexOf('-') + 1) - 'A';

        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length || seats[row][col] != null) {
            return false; // Invalid seat or seat already occupied
        }

        seats[row][col] = passengerName;
        return true;
    }
    	catch(NumberFormatException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e)
    	{
    		return false;
    	}
    }

    // Remove a passenger from a specified seat
    public static void removePassengerFromSeat(String[][] seats, String seat) {
    	try 
    	{
	        int row = Integer.parseInt(seat.substring(0, seat.indexOf('-'))) - 1;
	        int col = seat.charAt(seat.indexOf('-') + 1) - 'A';
	
	        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
	            seats[row][col] = null;
	        }
    	}
        catch(NumberFormatException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e)
        {
        	
        }
    }

    // Search for a seat reserved by a passenger by name
    public static String findSeatByPassengerName(String[][] seats, String passengerName) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null && seats[i][j].equals(passengerName)) {
                    return (i + 1) + "-" + (char) ('A' + j);
                }
            }
        }
        return null;
    }

    // Count the number of available seats in each row
    public static int[] countAvailableSeatsPerRow(String[][] seats) {
        int[] availableSeatsPerRow = new int[seats.length];
        for (int i = 0; i < seats.length; i++) {
            int count = 0;
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == null) {
                    count++;
                }
            }
            availableSeatsPerRow[i] = count;
        }
        return availableSeatsPerRow;
    }

    // Search for available n consecutive seats in the same row
    public static String searchAvailableConsecutiveSeats(String[][] seats, int n) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j <= seats[i].length - n; j++) {
                boolean found = true;
                for (int k = j; k < j + n; k++) {
                    if (seats[i][k] != null) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return (i + 1) + "-" + (char) ('A' + j);
                }
            }
        }
        return null;
    }

    //Randomly relocate passengers in the seating chart
    public static String[][] randomlyRelocatePassengers(String[][] seats) {
        return seats;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of seats per row: ");
        int seatsPerRow = scanner.nextInt();
        scanner.nextLine(); 

        String[][] seats = new String[rows][seatsPerRow];

        System.out.println("Add passengers to seats and enter 'done' to finish :");
        String input;
        while (true) {
            System.out.print("Enter seat number and passenger name (e.g., '1-A John'): ");
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                if (!addPassengerToSeat(seats, parts[0], parts[1])) {
                    System.out.println("Seat already occupied or invalid seat number.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("\nSeating Chart:");
        showSeatingChart(seats, 1, rows);
    }
}
