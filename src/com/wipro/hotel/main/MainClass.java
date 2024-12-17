package com.wipro.hotel.main;

import com.wipro.hotel.service.HotelBillService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        HotelBillService h = new HotelBillService();
        
        System.out.print("Enter Customer ID (8 characters): ");
        String customerId = scanner.nextLine();
        
        System.out.print("Enter Booking Date (dd/MM/yyyy): ");
        String bookingDateInput = scanner.nextLine();
  
        System.out.print("Enter Departure Date (dd/MM/yyyy): ");
        String departureDateInput = scanner.nextLine();
        
        System.out.print("Enter Room Type (AC/Non-AC): ");
        String roomType = scanner.nextLine();
     
        Date bookingDate = formatter.parse(bookingDateInput);
        Date departureDate = formatter.parse(departureDateInput);
        

        System.out.println(h.calculateBill(customerId, bookingDate, departureDate, roomType));
        
        scanner.close();
    }
}
